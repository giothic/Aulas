package automatizacao.example.automatizacao.details;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import automatizacao.example.automatizacao.Model.UsuarioModel;
import automatizacao.example.automatizacao.Repository.UsuarioRepository;

public class UsuarioDetailsServiceImp implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        UsuarioModel usuario = usuarioRepository.findByEmail(username).orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        return new UsuarioDetailsImpl(usuario);
    }

}
