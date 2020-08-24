package br.com.rdevs.ecommerce.pedido.repository;

import br.com.rdevs.ecommerce.pedido.model.entity.TbPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<TbPedido, Long> {
}
