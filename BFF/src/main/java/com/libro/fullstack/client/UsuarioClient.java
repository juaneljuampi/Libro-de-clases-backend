package com.libro.fullstack.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UsuarioClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL =
            "http://ms-usuarios:8082/usuarios";

    // LISTAR
    public Object obtenerUsuarios() {
        return restTemplate.getForObject(
                URL,
                Object.class
        );
    }

    // BUSCAR POR ID
    public Object obtenerUsuario(Long id) {
        return restTemplate.getForObject(
                URL + "/" + id,
                Object.class
        );
    }

    // BUSCAR ALUMNOS POR CURSO
    public Object obtenerUsuariosPorCurso(Long cursoId) {
        return restTemplate.getForObject(
                URL + "/curso/" + cursoId,
                Object.class
        );
    }

    // CREAR
    public Object crearUsuario(Object usuario) {
        return restTemplate.postForObject(
                URL,
                usuario,
                Object.class
        );
    }

    // ACTUALIZAR
    public Object actualizarUsuario(Long id, Object usuario) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request =
                new HttpEntity<>(usuario, headers);

        restTemplate.exchange(
                URL + "/" + id,
                HttpMethod.PUT,
                request,
                Object.class
        );

        return usuario;
    }

    // ELIMINAR
    public String eliminarUsuario(Long id) {

        restTemplate.delete(
                URL + "/" + id
        );

        return "Usuario eliminado correctamente";
    }
}