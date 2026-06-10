package com.libro.ms_academico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Asignatura;
import com.libro.ms_academico.repository.AsignaturaRepository;

@Service
public class AsignaturaService {

    @Autowired
    private AsignaturaRepository repo;

    public Asignatura guardar(Asignatura asignatura){
        return repo.save(asignatura);
    }

    public List<Asignatura> listar(){
        return repo.findAll();
    }

    public Optional<Asignatura> buscarPorId(Long id){
        return repo.findById(id);
    }

    public Asignatura actualizar(Long id,
                                 Asignatura asignaturaActualizada){

        Asignatura asignatura = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada"));

        asignatura.setNombre(asignaturaActualizada.getNombre());

        return repo.save(asignatura);
    }

    public void eliminar(Long id){

        Asignatura asignatura = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Asignatura no encontrada"));

        repo.delete(asignatura);
    }
}