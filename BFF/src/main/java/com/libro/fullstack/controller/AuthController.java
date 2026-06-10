package com.libro.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.libro.fullstack.dto.LoginRequest;
import com.libro.fullstack.security.JwtService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

@Autowired
private JwtService jwtService;

@PostMapping("/login")
public String login(@RequestBody LoginRequest request) {

    if (request.getEmail() == null || request.getEmail().isBlank()) {
        throw new RuntimeException("Email requerido");
    }

    if (request.getPassword() == null || request.getPassword().isBlank()) {
        throw new RuntimeException("Contraseña requerida");
    }

    return jwtService.generarToken(request.getEmail());
}

}
