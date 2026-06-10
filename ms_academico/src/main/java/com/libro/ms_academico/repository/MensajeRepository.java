package com.libro.ms_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libro.ms_academico.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}