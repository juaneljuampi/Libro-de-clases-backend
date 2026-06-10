package com.libro.ms_academico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Asistencia;
import com.libro.ms_academico.service.AsistenciaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    private AsistenciaService service;

   
    @GetMapping
    public List<Asistencia> listar(){
        return service.listar();
    }

    
    @GetMapping("/{id}")
    public Optional<Asistencia> buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Asistencia guardar(@RequestBody Asistencia asistencia){
        return service.guardar(asistencia);
    }


    @PutMapping("/{id}")
    public Asistencia actualizar(@PathVariable Long id,
                                  @RequestBody Asistencia asistencia){

        return service.actualizar(id, asistencia);
    }


    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id){

        service.eliminar(id);

        return "Asistencia eliminada correctamente";
    }
}