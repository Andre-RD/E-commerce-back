package br.com.rdevs.ecommerce.pedido.repository;

import br.com.rdevs.ecommerce.pedido.model.entity.TbPagamentoPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoPedidoRepository extends JpaRepository<TbPagamentoPedido, Long> {
    //List<TbPagamentoPedido> findByNome(String nmNomeTitular); // select da tabela onde nome for = ?
}