package tech.ada.locadoraVeiculos.service;

import org.springframework.stereotype.Service;
import tech.ada.locadoraVeiculos.exceptions.ObjetoNaoEncontradoException;
import tech.ada.locadoraVeiculos.model.TipoDeVeiculo;
import tech.ada.locadoraVeiculos.model.Veiculo;
import tech.ada.locadoraVeiculos.repository.VeiculoRepositorio;

import java.util.List;

@Service
public class BuscarVeiculoService {

    private final VeiculoRepositorio veiculoRepositorio;

    public BuscarVeiculoService(VeiculoRepositorio veiculoRepositorio){
        this.veiculoRepositorio = veiculoRepositorio;
    }

    public List<Veiculo> mostrarVeiculos(){
        return veiculoRepositorio.findAll();
    }

    public List<Veiculo> buscarPorTipo(TipoDeVeiculo tipoDeVeiculo){
        return  veiculoRepositorio.findByTipo(tipoDeVeiculo);
    }

    public Veiculo buscarPorPlaca(String placa){
        return veiculoRepositorio.findByPlaca(placa).orElseThrow(() -> new ObjetoNaoEncontradoException("Nenhum veículo encontrado com a placa:", placa));
    }

    public Integer buscarQuantidadeDeVeiculosDisponivel(){
        return veiculoRepositorio.mostrarNumeroDeVeiculosDisponiveis();
    }
}
