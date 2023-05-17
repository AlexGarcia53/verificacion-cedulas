/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.verificacion.controllers;

import com.example.verificacion.dtos.CedulaDTO;
import com.example.verificacion.dtos.WrapperResponse;
import com.example.verificacion.services.VerificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verificar")
public class VerificacionController {

    @Autowired
    private VerificacionService verificarService;

    @GetMapping("/cedula/{cedula}")
    public ResponseEntity<WrapperResponse<CedulaDTO>> verificar(@PathVariable String cedula){
        try{
            CedulaDTO cedulaObtenida = verificarService.obtenerCedula(cedula);
            WrapperResponse<CedulaDTO> response = new WrapperResponse<>("Cedula validada.", cedulaObtenida);
            return response.createResponse(HttpStatus.OK);
        }catch(Exception e){
            WrapperResponse<CedulaDTO> response = new WrapperResponse<>(e.getMessage(), null);
            return response.createResponse(HttpStatus.NOT_FOUND);
        }
    }
}
