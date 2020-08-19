package br.com.rdevs.ecommerce.estoque.repository;


import br.com.rdevs.ecommerce.estoque.model.entity.TbFilial;
import br.com.rdevs.ecommerce.estoque.model.entity.TbProdutoFilialEstoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<TbProdutoFilialEstoque, Long> {




}
