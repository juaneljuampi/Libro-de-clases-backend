package com.libro.ms_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libro.ms_academico.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}