package com.libro.ms_academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Nota;
import com.libro.ms_academico.service.NotaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaService service;

    
    @GetMapping
    public List<Nota> listar(){
        return service.listar();
    }


    @GetMapping("/{id}")
    public Optional<Nota> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

 
    @PostMapping
    public Nota guardar(@RequestBody Nota nota){
        return service.guardar(nota);
    }

    
    @PutMapping("/{id}")
    public Nota actualizar(@PathVariable Long id,
                            @RequestBody Nota nota){

        return service.actualizar(id, nota);
    }

    
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){

        service.eliminar(id);

        return "Nota eliminada correctamente";
    }
}