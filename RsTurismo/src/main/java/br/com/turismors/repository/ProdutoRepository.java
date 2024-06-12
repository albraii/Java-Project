package br.com.turismors.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.turismors.model.Produto;

/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 */
public interface ProdutoRepository extends CrudRepository<Produto,Long>{
    
}
