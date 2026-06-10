package com.libro.ms_usuarios.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libro.ms_usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}