package br.com.rdevs.ecommerce.pedido.repository;

import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<TbPedidoEntity, Long> {
}
