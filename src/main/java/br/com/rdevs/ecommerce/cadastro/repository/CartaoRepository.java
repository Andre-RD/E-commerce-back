package br.com.rdevs.ecommerce.cadastro.repository;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbCartaoCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<TbCartaoCredito, Long> {

}
