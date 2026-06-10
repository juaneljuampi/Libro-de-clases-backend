package com.libro.ms_academico.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.libro.ms_academico.model.Mensaje;
import com.libro.ms_academico.repository.MensajeRepository;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository repo;

    public Mensaje guardar(Mensaje mensaje){
        return repo.save(mensaje);
    }

    public List<Mensaje> listar(){
        return repo.findAll();
    }
    
}