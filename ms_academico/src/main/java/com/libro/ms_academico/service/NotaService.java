package com.libro.ms_academico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Nota;
import com.libro.ms_academico.repository.NotaRepository;

@Service
public class NotaService {

    @Autowired
    private NotaRepository repo;

 
    public Nota guardar(Nota nota){
        return repo.save(nota);
    }


    public List<Nota> listar(){
        return repo.findAll();
    }

    public Optional<Nota> buscarPorId(Long id){
        return repo.findById(id);
    }

   
    public Nota actualizar(Long id, Nota notaActualizada){

        Nota nota = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota no encontrada"));

        nota.setCalificacion(notaActualizada.getCalificacion());
        nota.setAlumnoId(notaActualizada.getAlumnoId());
        nota.setAsignaturaId(notaActualizada.getAsignaturaId());

        return repo.save(nota);
    }

    public void eliminar(Long id){

        Nota nota = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota no encontrada"));

        repo.delete(nota);
    }
}