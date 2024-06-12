package br.com.turismors.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 12/05/2021
 * @brief  class PessoaJuridica
 */
@Entity
@Getter
@Setter
public class PessoaJuridica extends Cliente{
    @Size(min=1,message = "O CNPJ precisa ser válido.")
    private String cnpj;

}
