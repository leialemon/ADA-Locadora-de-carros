package tech.ada.locadora_de_carros.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.redis.core.RedisHash;

@Entity
@RedisHash("Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O campo nome e de preenchimento obrigatorio!")
    private String name;

    @NotBlank(message = "O campo CNH e de preenchimento obrigatorio")
    private String cnh;

    @CPF(message = "Por favor, insira um CPF valido!")
    @NotNull
    private String cpf;

    private String endereco;



}
