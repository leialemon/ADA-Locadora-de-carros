package tech.ada.locadoraVeiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.ada.locadoraVeiculos.model.TipoDeVeiculo;
import tech.ada.locadoraVeiculos.model.Veiculo;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeiculoRepositorio extends JpaRepository<Veiculo, Long> {
    public List<Veiculo> findByTipo(TipoDeVeiculo tipo);
    public Optional<Veiculo> findByPlaca(String placa);
    public List<Veiculo> findByDisponivel(boolean disponivel);
    @Query(value = "SELECT COUNT(*) FROM Veiculo WHERE disponivel = true")
    public Integer mostrarNumeroDeVeiculosDisponiveis();
}
