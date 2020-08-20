package br.com.rdevs.ecommerce.pedido.repository;


import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoDesconto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDescontoRepository extends JpaRepository<TbPedidoDesconto, Long> {
}
