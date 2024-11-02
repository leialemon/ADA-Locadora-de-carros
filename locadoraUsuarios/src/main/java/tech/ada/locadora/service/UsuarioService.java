package tech.ada.locadora.service;

import org.springframework.stereotype.Service;
import tech.ada.locadora.exceptions.ObjetoNaoEncontradoException;
import tech.ada.locadora.model.Usuario;
import tech.ada.locadora.repository.UsuarioRepository;

import java.util.List;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarUsuarioPorCpf(String cpf){
        return usuarioRepository.findByCpf(cpf).orElseThrow(() -> new ObjetoNaoEncontradoException("Usuário não encontrado!"));
    }

    public List<Usuario> mostrarTodosOsUsuarios(){
        return usuarioRepository.findAll();
    }
}
