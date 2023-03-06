package br.com.training.processadorValidacaoJob.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

@Data
public class Cliente {

    @NotNull
    @Size(min = 1,max = 100)
    @Pattern(regexp = "[a-zA-Z\\s]+",message = "Nome em formato invalido")
    private String nome;
    @NotNull
    @Range(min = 18,max = 130)
    private Integer idade;
    @NotNull
    @Size(min = 1,max = 100)
    @Pattern(regexp = "^[a-z\\d.]+@[a-z\\d]+.[a-z]+.([a-z]+)?$",message = "email em formato inalido")
    private String email;

}
