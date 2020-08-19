package br.com.rdevs.ecommerce.pagamentopedido.repository;

import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbPagamentoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagamentoPedidoRepository extends JpaRepository<TbPagamentoPedido, Long> {
    List<TbPagamentoPedido> findByNome(String nmNomeTitular); // select da tabela onde nome for = ?
}