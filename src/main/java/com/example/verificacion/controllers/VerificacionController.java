/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.verificacion.controllers;

import com.example.verificacion.services.VerificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verificar")
public class VerificacionController {

    @Autowired
    private VerificacionService verificarService;

    @GetMapping("/{cedula}")
    public boolean verificarCedula(@PathVariable String cedula) {
        return verificarService.verificarCedula(cedula);
    }
    
    @GetMapping("/prueba")
    public String metodoPrueba(){
        return "prueba";
    }

}
