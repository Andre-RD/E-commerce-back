package br.com.rdevs.ecommerce.pedido.repository;

import br.com.rdevs.ecommerce.pedido.model.entity.TbCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<TbCliente, Integer> {

}
