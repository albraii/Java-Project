package br.com.turismors.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.turismors.model.Venda;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface VendaRepository extends CrudRepository<Venda,Long>{
    
}
