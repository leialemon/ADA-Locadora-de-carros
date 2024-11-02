package tech.ada.locadoraVeiculos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.ada.locadoraVeiculos.model.TipoDeVeiculo;
import tech.ada.locadoraVeiculos.model.Veiculo;
import tech.ada.locadoraVeiculos.service.BuscarVeiculoService;
import tech.ada.locadoraVeiculos.service.CriarVeiculoService;

import java.util.List;

@RestController
@RequestMapping("/v1/veiculos")
public class VeiculoController {

    private final CriarVeiculoService criarVeiculoService;
    private final BuscarVeiculoService buscarVeiculoService;

    public VeiculoController(CriarVeiculoService criarVeiculoService, BuscarVeiculoService buscarVeiculoService){
        this.buscarVeiculoService = buscarVeiculoService;
        this.criarVeiculoService = criarVeiculoService;
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public String criarVeiculo(@RequestBody Veiculo veiculo){
        criarVeiculoService.criarVeiculo(veiculo);
        return "Veículo criado com sucesso!";
    }

    @GetMapping
    public List<Veiculo> mostrarVeiculos(){
        return buscarVeiculoService.mostrarVeiculos();
    }

    @GetMapping("/buscar/tipo")
    public List<Veiculo> mostrarVeiculosPorTipo(@RequestParam TipoDeVeiculo tipoDeVeiculo){
        return buscarVeiculoService.buscarPorTipo(tipoDeVeiculo);
    }

    @GetMapping("/buscar/")
    public Veiculo buscarVeiculoPorPlaca(@PathVariable String placa){
        return buscarVeiculoService.buscarPorPlaca(placa);
    }
}
