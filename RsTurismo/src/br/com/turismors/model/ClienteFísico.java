package br.com.turismors.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ClienteFísico extends Cliente{
    @Size(min=1,message = "O CPF precisa ser válido")
    private String cpf;
}