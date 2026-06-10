package com.libro.fullstack.controller;

import com.libro.fullstack.client.AcademicoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class AcademicoProxyController {

    @Autowired
    private AcademicoClient academicoClient;



    @GetMapping("/cursos")
    public Object cursos() {
        return academicoClient.obtenerCursos();
    }

    @GetMapping("/cursos/{id}")
    public Object curso(@PathVariable Long id) {
        return academicoClient.obtenerCurso(id);
    }

    @PostMapping("/cursos")
    public Object crearCurso(@RequestBody Object curso) {
        return academicoClient.crearCurso(curso);
    }

    @PutMapping("/cursos/{id}")
    public Object actualizarCurso(
            @PathVariable Long id,
            @RequestBody Object curso) {

        return academicoClient.actualizarCurso(id, curso);
    }

    @DeleteMapping("/cursos/{id}")
    public Object eliminarCurso(@PathVariable Long id) {
        return academicoClient.eliminarCurso(id);
    }

    @GetMapping("/asignaturas")
    public Object asignaturas() {
        return academicoClient.obtenerAsignaturas();
    }

    @GetMapping("/asignaturas/{id}")
    public Object asignatura(@PathVariable Long id) {
        return academicoClient.obtenerAsignatura(id);
    }

    @PostMapping("/asignaturas")
    public Object crearAsignatura(@RequestBody Object asignatura) {
        return academicoClient.crearAsignatura(asignatura);
    }

    @PutMapping("/asignaturas/{id}")
    public Object actualizarAsignatura(
            @PathVariable Long id,
            @RequestBody Object asignatura) {

        return academicoClient.actualizarAsignatura(id, asignatura);
    }

    @DeleteMapping("/asignaturas/{id}")
    public Object eliminarAsignatura(@PathVariable Long id) {
        return academicoClient.eliminarAsignatura(id);
    }

  

    @GetMapping("/notas")
    public Object notas() {
        return academicoClient.obtenerNotas();
    }

    @GetMapping("/notas/{id}")
    public Object nota(@PathVariable Long id) {
        return academicoClient.obtenerNota(id);
    }

    @PostMapping("/notas")
    public Object crearNota(@RequestBody Object nota) {
        return academicoClient.crearNota(nota);
    }

    @PutMapping("/notas/{id}")
    public Object actualizarNota(
            @PathVariable Long id,
            @RequestBody Object nota) {

        return academicoClient.actualizarNota(id, nota);
    }

    @DeleteMapping("/notas/{id}")
    public Object eliminarNota(@PathVariable Long id) {
        return academicoClient.eliminarNota(id);
    }


    @GetMapping("/asistencia")
    public Object asistencia() {
        return academicoClient.obtenerAsistencia();
    }

    @GetMapping("/asistencia/{id}")
    public Object asistenciaPorId(@PathVariable Long id) {
        return academicoClient.obtenerAsistenciaPorId(id);
    }

    @PostMapping("/asistencia")
    public Object crearAsistencia(@RequestBody Object asistencia) {
        return academicoClient.crearAsistencia(asistencia);
    }

    @PutMapping("/asistencia/{id}")
    public Object actualizarAsistencia(
            @PathVariable Long id,
            @RequestBody Object asistencia) {

        return academicoClient.actualizarAsistencia(id, asistencia);
    }

    @DeleteMapping("/asistencia/{id}")
    public Object eliminarAsistencia(@PathVariable Long id) {
        return academicoClient.eliminarAsistencia(id);
    }



    @GetMapping("/mensajes")
    public Object mensajes() {
        return academicoClient.obtenerMensajes();
    }

    @PostMapping("/mensajes")
    public Object crearMensaje(@RequestBody Object mensaje) {
        return academicoClient.crearMensaje(mensaje);
    }
}