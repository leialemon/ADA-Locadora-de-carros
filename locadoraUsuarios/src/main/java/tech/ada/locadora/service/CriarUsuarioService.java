package tech.ada.locadora.service;

import org.springframework.stereotype.Service;
import tech.ada.locadora.model.Usuario;
import tech.ada.locadora.repository.UsuarioRepository;

@Service
public class CriarUsuarioService {

    private final UsuarioRepository usuarioRepository;

    public CriarUsuarioService (UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void criarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
