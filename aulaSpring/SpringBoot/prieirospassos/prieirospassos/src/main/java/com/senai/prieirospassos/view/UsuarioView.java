package com.senai.prieirospassos.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.senai.prieirospassos.model.Usuario;

@Repository
public class UsuarioView {

    public void save(Usuario usuario){
        System.out.println("Salvar - recebendo um novo usuário");
        System.out.println(usuario);
    }

    public List<Usuario> listAll(){

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Damarcones", "1234"));

        return usuarios;
    }

}
