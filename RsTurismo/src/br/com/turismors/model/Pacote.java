package br.com.turismors.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Pacote{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Size(min=1, message = "Nome do pacote precisa ser válido.")
    private String nome;
    private float preco;
    
    @Override
    public String toString(){
        return nome;
    }
    
}
