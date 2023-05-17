/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.verificacion.services;

import com.cedulasservicegrpc.grpc.CedulasResponse;
import com.cedulasservicegrpc.grpc.Empty;
import com.cedulasservicegrpc.grpc.cedulasServiceGrpc;
import com.example.verificacion.dtos.Cedula;
import com.example.verificacion.dtos.CedulaDTO;
import com.example.verificacion.dtos.Response;
import com.example.verificacion.security.JWTUtils;
import com.fasterxml.jackson.databind.JsonNode;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VerificacionService {
    boolean cedulaValida = false;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private JWTUtils jwtUtils;
    private final String URL_CEDULAS = "http://localhost:8099/cedulas/";

    public boolean verificarCedula(String cedula) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089)
                .usePlaintext()
                .build();

        // crear un stub para llamar al método ObtenerCedulas
        cedulasServiceGrpc.cedulasServiceStub stub = cedulasServiceGrpc.newStub(channel);
        // crear una solicitud del mensaje Empty
        Empty request = Empty.newBuilder().build();
        // llamar al método ObtenerCedulas del servidor RPC

        CountDownLatch latch = new CountDownLatch(1);
        AtomicBoolean cedulaValida = new AtomicBoolean(false);
        StreamObserver<CedulasResponse> responseObserver = new StreamObserver<CedulasResponse>() {
            @Override
            public void onNext(CedulasResponse response) {
                cedulaValida.set(validarCedula(cedula, response.getCedulasList()));
            }

            @Override
            public void onError(Throwable thrwbl) {
                System.out.println("Ocurrio un error al obtener las cédulas" + thrwbl.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Operación terminada");
                channel.shutdown();
                latch.countDown();
            }

        };

        stub.obtenerCedulas(request, responseObserver);

        latch.await();

        return cedulaValida.get();
    }

    private boolean validarCedula(String cedula, List<String> cedulas) {
        for (String c : cedulas) {
            if (c.equals(cedula)) {
                return true;
            }
        }
        return false;
    }

    public CedulaDTO obtenerCedula(String numeroCedula){
        ResponseEntity<JsonNode> responseEntity;
        try {
            responseEntity = restTemplate.getForEntity(URL_CEDULAS + numeroCedula, JsonNode.class);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new RuntimeException("La cedula no existe");
        }

        JsonNode responseBody = responseEntity.getBody();
        String message = responseBody.get("message").asText();
        JsonNode body = responseBody.get("body");

        if (!"Cedula valida".equals(message) || body == null) {
            throw new RuntimeException("Cedula inválida.");
        }

        CedulaDTO cedulaDTO = new CedulaDTO(
                body.get("cedulaMedico").asText(),
                body.get("nombre").asText(),
                jwtUtils.generateToken(body.get("cedulaMedico").asText(), body.get("nombre").asText())
        );
        return cedulaDTO;
    }
}
