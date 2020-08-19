package br.com.rdevs.ecommerce.cadastro.service.bo;

import br.com.rdevs.ecommerce.cadastro.model.dto.CartaoCreditoDTO;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCartaoCredito;
import org.springframework.stereotype.Component;

@Component
public class CartaoCreditoBO {

    public CartaoCreditoDTO parseToDTO(TbCartaoCredito cartaoCreditoEntity){
        CartaoCreditoDTO cartaoCreditoDTO = new CartaoCreditoDTO();

        cartaoCreditoDTO.setIdCartaoCredito(cartaoCreditoEntity.getIdCartaoCredito());
        cartaoCreditoDTO.setNrNumeroCartao(cartaoCreditoEntity.getNrNumeroCartao());
        cartaoCreditoDTO.setNmNomeTitular(cartaoCreditoEntity.getNmNomeTitular());

        return cartaoCreditoDTO;
    }

    public TbCartaoCredito parseToEntity(CartaoCreditoDTO cartaoCreditoDTO){
        TbCartaoCredito cartaoCreditoEntity = new TbCartaoCredito();

        cartaoCreditoEntity.setIdCartaoCredito(cartaoCreditoDTO.getIdCartaoCredito());
        cartaoCreditoEntity.setNrNumeroCartao(cartaoCreditoDTO.getNrNumeroCartao());
        cartaoCreditoEntity.setNmNomeTitular(cartaoCreditoDTO.getNmNomeTitular());

        return cartaoCreditoEntity;
    }

}
