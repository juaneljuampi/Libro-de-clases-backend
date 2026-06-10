package com.libro.ms_academico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.libro.ms_academico.model.Asistencia;
import com.libro.ms_academico.repository.AsistenciaRepository;

@Service
public class AsistenciaService {

    @Autowired
    private AsistenciaRepository repo;


    public Asistencia guardar(Asistencia asistencia){
        return repo.save(asistencia);
    }


    public List<Asistencia> listar(){
        return repo.findAll();
    }


    public Optional<Asistencia> buscarPorId(Long id){
        return repo.findById(id);
    }

    public Asistencia actualizar(Long id,
                                 Asistencia asistenciaActualizada){

        Asistencia asistencia = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Asistencia no encontrada"));

        asistencia.setAlumnoId(asistenciaActualizada.getAlumnoId());
        asistencia.setFecha(asistenciaActualizada.getFecha());
        asistencia.setPresente(asistenciaActualizada.getPresente());

        return repo.save(asistencia);
    }

 
    public void eliminar(Long id){

        Asistencia asistencia = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Asistencia no encontrada"));

        repo.delete(asistencia);
    }
}