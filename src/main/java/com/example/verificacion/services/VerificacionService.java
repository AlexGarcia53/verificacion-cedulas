/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.verificacion.services;

import com.cedulasservicegrpc.grpc.CedulasResponse;
import com.cedulasservicegrpc.grpc.Empty;
import com.cedulasservicegrpc.grpc.cedulasServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VerificacionService {
        public boolean verificarCedula(String cedula) {
       		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8089)
                        .usePlaintext()
                        .build();
                
        // crear un stub para llamar al método ObtenerCedulas
        cedulasServiceGrpc.cedulasServiceBlockingStub stub = cedulasServiceGrpc.newBlockingStub(channel);
        // crear una solicitud del mensaje Empty
        Empty request = Empty.newBuilder().build();
        // llamar al método ObtenerCedulas del servidor RPC
        CedulasResponse response = stub.obtenerCedulas(request);       
        boolean cedulaValida = validarCedula(cedula, response.getCedulasList());  
        
        channel.shutdown();
        
        return cedulaValida;
    }
    
    private boolean validarCedula(String cedula, List<String> cedulas) {
        for (String c : cedulas) {
            if (c.equals(cedula)) {
                return true;
            }
        }
        return false;
    }
}
