package com.biblioteca.gerenciamento.controller;

import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.gerenciamento.model.UsuarioModel;
import com.biblioteca.gerenciamento.repository.UsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/adcionarusuario")
    public UsuarioModel addUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/listarusuario")
    public List<UsuarioModel> listarUsuario() {
        return usuarioRepository.findAll();
    }
    
    

}
