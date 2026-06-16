package com.libro.ms_usuarios.service;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import com.libro.ms_usuarios.model.Usuario;
import com.libro.ms_usuarios.repository.UsuarioRepository;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private UsuarioRepository repo;

    @InjectMocks
    private UsuarioService service;

    @Test
    void deberiaGuardarUsuario() {

        Usuario usuario = new Usuario();

        when(repo.save(usuario))
                .thenReturn(usuario);

        Usuario resultado =
                service.guardar(usuario);

        assertNotNull(resultado);

        verify(repo)
                .save(usuario);
    }

    @Test
    void deberiaListarUsuarios() {

        when(repo.findAll())
                .thenReturn(Arrays.asList(
                        new Usuario(),
                        new Usuario()
                ));

        assertEquals(
                2,
                service.listar().size()
        );

        verify(repo)
                .findAll();
    }

    @Test
    void deberiaBuscarUsuarioPorId() {

        Usuario usuario = new Usuario();

        when(repo.findById(1L))
                .thenReturn(Optional.of(usuario));

        Optional<Usuario> resultado =
                service.buscarPorId(1L);

        assertTrue(resultado.isPresent());

        verify(repo)
                .findById(1L);
    }

    @Test
    void deberiaBuscarUsuariosPorCurso() {

        when(repo.findByCursoId(1L))
                .thenReturn(Arrays.asList(
                        new Usuario(),
                        new Usuario()
                ));

        assertEquals(
                2,
                service.buscarPorCurso(1L).size()
        );

        verify(repo)
                .findByCursoId(1L);
    }

    @Test
    void deberiaActualizarUsuario() {

        Usuario usuario =
                new Usuario();

        Usuario actualizado =
                new Usuario();

        actualizado.setNombre("Pedro");

        when(repo.findById(1L))
                .thenReturn(Optional.of(usuario));

        when(repo.save(any(Usuario.class)))
                .thenAnswer(i -> i.getArgument(0));

        Usuario resultado =
                service.actualizar(
                        1L,
                        actualizado
                );

        assertEquals(
                "Pedro",
                resultado.getNombre()
        );

        verify(repo)
                .findById(1L);

        verify(repo)
                .save(any(Usuario.class));
    }

    @Test
    void deberiaEliminarUsuario() {

        Usuario usuario =
                new Usuario();

        when(repo.findById(1L))
                .thenReturn(Optional.of(usuario));

        service.eliminar(1L);

        verify(repo)
                .delete(usuario);
    }

    @Test
    void deberiaAsignarCurso() {

        Usuario usuario =
                new Usuario();

        when(repo.findById(1L))
                .thenReturn(Optional.of(usuario));

        when(repo.save(any(Usuario.class)))
                .thenAnswer(i -> i.getArgument(0));

        Usuario resultado =
                service.asignarCurso(
                        1L,
                        5L
                );

        assertEquals(
                5L,
                resultado.getCursoId()
        );

        verify(repo)
                .save(any(Usuario.class));
    }

    @Test
    void deberiaLanzarExcepcionAlActualizarUsuarioInexistente() {

        when(repo.findById(1L))
                .thenReturn(Optional.empty());

        RuntimeException ex =
                assertThrows(
                        RuntimeException.class,
                        () -> service.actualizar(
                                1L,
                                new Usuario()
                        )
                );

        assertEquals(
                "Usuario no encontrado",
                ex.getMessage()
        );
    }

    @Test
    void deberiaLanzarExcepcionAlEliminarUsuarioInexistente() {

        when(repo.findById(1L))
                .thenReturn(Optional.empty());

        RuntimeException ex =
                assertThrows(
                        RuntimeException.class,
                        () -> service.eliminar(1L)
                );

        assertEquals(
                "Usuario no encontrado",
                ex.getMessage()
        );
    }
}