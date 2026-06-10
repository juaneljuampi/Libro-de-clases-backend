package com.libro.ms_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libro.ms_academico.model.Asignatura;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}