package com.libro.ms_usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import com.libro.ms_usuarios.model.Usuario;
import com.libro.ms_usuarios.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(
            @PathVariable Long id,
            @RequestBody Usuario usuario) {

        return service.actualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {

        service.eliminar(id);

        return "Usuario eliminado correctamente";
    }

    @GetMapping("/curso/{cursoId}")
    public List<Usuario> obtenerPorCurso(
            @PathVariable Long cursoId) {

        return service.buscarPorCurso(cursoId);
    }
    @PutMapping("/{id}/curso/{cursoId}")
public Usuario asignarCurso(
        @PathVariable Long id,
        @PathVariable Long cursoId) {

    return service.asignarCurso(id, cursoId);
}
}