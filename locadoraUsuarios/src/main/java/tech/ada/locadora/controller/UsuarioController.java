package tech.ada.locadora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.ada.locadora.model.Usuario;
import tech.ada.locadora.service.CriarUsuarioService;
import tech.ada.locadora.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("v1/usuarios")
public class UsuarioController {

    private final CriarUsuarioService criarUsuarioService;
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService, CriarUsuarioService criarUsuario){
        this.criarUsuarioService = criarUsuario;
        this.usuarioService = usuarioService;
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public String criarUsuario(@RequestBody Usuario usuario){
        criarUsuarioService.criarUsuario(usuario);
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
