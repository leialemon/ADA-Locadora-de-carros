package tech.ada.locadoraVeiculos.service;

import org.springframework.stereotype.Service;
import tech.ada.locadoraVeiculos.model.Veiculo;
import tech.ada.locadoraVeiculos.repository.VeiculoRepositorio;

@Service
public class CriarVeiculoService {

    private final VeiculoRepositorio veiculoRepositorio;

    public CriarVeiculoService(VeiculoRepositorio veiculoRepositorio){
        this.veiculoRepositorio = veiculoRepositorio;
    }

    public void criarVeiculo(Veiculo veiculo){
        veiculoRepositorio.save(veiculo);
    }
}
