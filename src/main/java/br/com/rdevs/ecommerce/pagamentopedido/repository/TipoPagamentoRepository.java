package br.com.rdevs.ecommerce.pagamentopedido.repository;

import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbTipoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPagamentoRepository extends JpaRepository<TbTipoPagamento, Long> {
}
