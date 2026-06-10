package com.libro.ms_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libro.ms_academico.model.Asistencia;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
}