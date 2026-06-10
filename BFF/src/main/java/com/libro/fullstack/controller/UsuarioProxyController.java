package com.libro.fullstack.controller;

import com.libro.fullstack.client.UsuarioClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class UsuarioProxyController {

    @Autowired
    private UsuarioClient usuarioClient;

    // LISTAR
    @GetMapping
    public Object listarUsuarios() {
        return usuarioClient.obtenerUsuarios();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Object obtenerUsuario(@PathVariable Long id) {
        return usuarioClient.obtenerUsuario(id);
    }

    // CREAR
    @PostMapping
    public Object crearUsuario(@RequestBody Object usuario) {
        return usuarioClient.crearUsuario(usuario);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Object actualizarUsuario(
            @PathVariable Long id,
            @RequestBody Object usuario) {

        return usuarioClient.actualizarUsuario(id, usuario);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public Object eliminarUsuario(@PathVariable Long id) {
        return usuarioClient.eliminarUsuario(id);
    }
}