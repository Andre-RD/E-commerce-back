package br.com.rdevs.ecommerce.pagamentopedido.repository;

import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbPedidoDesconto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoDescontoRepository extends JpaRepository<TbPedidoDesconto, Long> {
}
