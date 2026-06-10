package com.libro.ms_academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.libro.ms_academico.model.Mensaje;
import com.libro.ms_academico.service.MensajeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/mensajes")
public class MensajeController {

    @Autowired
    private MensajeService service;

    @PostMapping
    public Mensaje guardar(@RequestBody Mensaje mensaje){
        return service.guardar(mensaje);
    }

    @GetMapping
    public List<Mensaje> listar(){
        return service.listar();
    }
    
}