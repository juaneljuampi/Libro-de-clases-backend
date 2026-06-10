package com.libro.ms_academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Curso;
import com.libro.ms_academico.service.CursoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoService service;

   
    @GetMapping
    public List<Curso> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Curso> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

   
    @PostMapping
    public Curso guardar(@RequestBody Curso curso){
        return service.guardar(curso);
    }

    
    @PutMapping("/{id}")
    public Curso actualizar(@PathVariable Long id,
                             @RequestBody Curso curso){

        return service.actualizar(id, curso);
    }

  
    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){

        service.eliminar(id);

        return "Curso eliminado correctamente";
    }
}