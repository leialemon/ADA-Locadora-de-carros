package tech.ada.locadora.usuario;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping("/criar")
    public String criarUsuario(@RequestBody Usuario usuario){
        usuarioService.criarUsuario(usuario);
        return "Usuário criado com sucesso!";
    }

    @GetMapping("/buscar/")
    public Usuario buscarUsuarioPorCpf(@PathVariable String cpf){
        return usuarioService.buscarUsuarioPorCpf(cpf);
    }

    @GetMapping()
    public List<Usuario> mostrarUsuarios(){
        return usuarioService.mostrarTodosOsUsuarios();
    }

}
