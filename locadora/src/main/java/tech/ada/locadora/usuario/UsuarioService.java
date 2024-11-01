package tech.ada.locadora.usuario;

import org.springframework.stereotype.Service;
import tech.ada.locadora.exceptions.ObjetoNaoEncontradoException;

import java.util.List;


@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public void criarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorCpf(String cpf){
        return usuarioRepository.findByCpf(cpf).orElseThrow(() -> new ObjetoNaoEncontradoException("Usuário não encontrado!"));
    }

    public List<Usuario> mostrarTodosOsUsuarios(){
        return usuarioRepository.findAll();
    }
}
