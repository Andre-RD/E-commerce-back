package br.com.rdevs.ecommerce.pagamentopedido.repository;

import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbEcommCupomDesconto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcommCupomDescontoRepository extends JpaRepository<TbEcommCupomDesconto, Long> {
}
