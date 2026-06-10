package com.libro.fullstack.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AcademicoClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL =
            "http://ms-academico:8083";



    public Object obtenerCursos() {
        return restTemplate.getForObject(
                URL + "/cursos",
                Object.class
        );
    }

    public Object obtenerCurso(Long id) {
        return restTemplate.getForObject(
                URL + "/cursos/" + id,
                Object.class
        );
    }

    public Object crearCurso(Object curso) {
        return restTemplate.postForObject(
                URL + "/cursos",
                curso,
                Object.class
        );
    }

    public Object actualizarCurso(Long id, Object curso) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request =
                new HttpEntity<>(curso, headers);

        restTemplate.exchange(
                URL + "/cursos/" + id,
                HttpMethod.PUT,
                request,
                Object.class
        );

        return curso;
    }

    public String eliminarCurso(Long id) {

        restTemplate.delete(
                URL + "/cursos/" + id
        );

        return "Curso eliminado correctamente";
    }



    public Object obtenerAsignaturas() {
        return restTemplate.getForObject(
                URL + "/asignaturas",
                Object.class
        );
    }

    public Object obtenerAsignatura(Long id) {
        return restTemplate.getForObject(
                URL + "/asignaturas/" + id,
                Object.class
        );
    }

    public Object crearAsignatura(Object asignatura) {
        return restTemplate.postForObject(
                URL + "/asignaturas",
                asignatura,
                Object.class
        );
    }

    public Object actualizarAsignatura(Long id, Object asignatura) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request =
                new HttpEntity<>(asignatura, headers);

        restTemplate.exchange(
                URL + "/asignaturas/" + id,
                HttpMethod.PUT,
                request,
                Object.class
        );

        return asignatura;
    }

    public String eliminarAsignatura(Long id) {

        restTemplate.delete(
                URL + "/asignaturas/" + id
        );

        return "Asignatura eliminada correctamente";
    }


    public Object obtenerNotas() {
        return restTemplate.getForObject(
                URL + "/notas",
                Object.class
        );
    }

    public Object obtenerNota(Long id) {
        return restTemplate.getForObject(
                URL + "/notas/" + id,
                Object.class
        );
    }

    public Object crearNota(Object nota) {
        return restTemplate.postForObject(
                URL + "/notas",
                nota,
                Object.class
        );
    }

    public Object actualizarNota(Long id, Object nota) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request =
                new HttpEntity<>(nota, headers);

        restTemplate.exchange(
                URL + "/notas/" + id,
                HttpMethod.PUT,
                request,
                Object.class
        );

        return nota;
    }

    public String eliminarNota(Long id) {

        restTemplate.delete(
                URL + "/notas/" + id
        );

        return "Nota eliminada correctamente";
    }

 

    public Object obtenerAsistencia() {
        return restTemplate.getForObject(
                URL + "/asistencia",
                Object.class
        );
    }

    public Object obtenerAsistenciaPorId(Long id) {
        return restTemplate.getForObject(
                URL + "/asistencia/" + id,
                Object.class
        );
    }

    public Object crearAsistencia(Object asistencia) {
        return restTemplate.postForObject(
                URL + "/asistencia",
                asistencia,
                Object.class
        );
    }

    public Object actualizarAsistencia(Long id, Object asistencia) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> request =
                new HttpEntity<>(asistencia, headers);

        restTemplate.exchange(
                URL + "/asistencia/" + id,
                HttpMethod.PUT,
                request,
                Object.class
        );

        return asistencia;
    }

    public String eliminarAsistencia(Long id) {

        restTemplate.delete(
                URL + "/asistencia/" + id
        );

        return "Asistencia eliminada correctamente";
    }


    public Object obtenerMensajes() {
        return restTemplate.getForObject(
                URL + "/mensajes",
                Object.class
        );
    }

    public Object crearMensaje(Object mensaje) {
        return restTemplate.postForObject(
                URL + "/mensajes",
                mensaje,
                Object.class
        );
    }
}