package br.com.rdevs.ecommerce.cadastro.repository;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<TbCliente, Integer> {

}
