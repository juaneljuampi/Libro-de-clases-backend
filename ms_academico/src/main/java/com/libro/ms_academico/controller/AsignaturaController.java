package com.libro.ms_academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Asignatura;
import com.libro.ms_academico.service.AsignaturaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaService service;

    @GetMapping
    public List<Asignatura> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Asignatura> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Asignatura guardar(@RequestBody Asignatura asignatura){
        return service.guardar(asignatura);
    }

    @PutMapping("/{id}")
    public Asignatura actualizar(@PathVariable Long id,
                                 @RequestBody Asignatura asignatura){

        return service.actualizar(id, asignatura);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){

        service.eliminar(id);

        return "Asignatura eliminada";
    }
}