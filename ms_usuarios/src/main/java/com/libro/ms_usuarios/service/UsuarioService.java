package com.libro.ms_usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.libro.ms_usuarios.model.Usuario;
import com.libro.ms_usuarios.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repo.findById(id);
    }

    public List<Usuario> buscarPorCurso(Long cursoId) {
        return repo.findByCursoId(cursoId);
    }

    public Usuario actualizar(Long id, Usuario usuarioActualizado) {

        Usuario usuario = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setNombre(usuarioActualizado.getNombre());
        usuario.setEmail(usuarioActualizado.getEmail());
        usuario.setPassword(usuarioActualizado.getPassword());
        usuario.setRol(usuarioActualizado.getRol());

        usuario.setCursoId(usuarioActualizado.getCursoId());

        return repo.save(usuario);
    }

    public void eliminar(Long id) {

        Usuario usuario = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        repo.delete(usuario);
    }

    public Usuario asignarCurso(Long id, Long cursoId) {

    Usuario usuario = repo.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

    usuario.setCursoId(cursoId);

    return repo.save(usuario);
}
}