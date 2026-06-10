package com.libro.ms_academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libro.ms_academico.model.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}