package com.libro.ms_academico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Curso;
import com.libro.ms_academico.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repo;

    // CREAR
    public Curso guardar(Curso curso){
        return repo.save(curso);
    }

   
    public List<Curso> listar(){
        return repo.findAll();
    }

    
    public Optional<Curso> buscarPorId(Long id){
        return repo.findById(id);
    }


    public Curso actualizar(Long id, Curso cursoActualizado){

        Curso curso = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        curso.setNombre(cursoActualizado.getNombre());
        curso.setDescripcion(cursoActualizado.getDescripcion());
        curso.setProfesor(cursoActualizado.getProfesor());

        return repo.save(curso);
    }

    
    public void eliminar(Long id){

        Curso curso = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado"));

        repo.delete(curso);
    }
}