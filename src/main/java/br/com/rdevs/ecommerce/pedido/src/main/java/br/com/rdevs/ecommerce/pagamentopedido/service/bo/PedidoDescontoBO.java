package br.com.rdevs.ecommerce.pagamentopedido.service.bo;

import br.com.rdevs.ecommerce.pagamentopedido.model.dto.PedidoDescontoDTO;
import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbPedidoDesconto;
import org.springframework.stereotype.Component;

@Component
public class PedidoDescontoBO {

    public PedidoDescontoDTO parseToDTO(TbPedidoDesconto entity){
        PedidoDescontoDTO dto = new PedidoDescontoDTO();

        if(entity == null)
            return dto;

        dto.setIdPedido(entity.getIdPedidoDesconto());
        dto.setIdPedidoDesconto(entity.getIdPedidoDesconto());

        return dto;
    }

    public TbPedidoDesconto parseToEntity( PedidoDescontoDTO dto, TbPedidoDesconto entity){
        if( entity == null)
            entity = new TbPedidoDesconto();

        if(dto == null)
            return entity;

        entity.setIdEcommCupomDesconto(entity.getIdPedidoDesconto());
        entity.setIdPedidoDesconto(entity.getIdPedidoDesconto());

        return entity;
    }
}
