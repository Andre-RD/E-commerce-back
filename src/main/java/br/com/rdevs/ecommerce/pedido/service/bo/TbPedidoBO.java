package br.com.rdevs.ecommerce.pedido.service.bo;

import br.com.rdevs.ecommerce.pedido.model.dto.PedidoDTO;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedido;
import org.springframework.stereotype.Component;

@Component
public class TbPedidoBO {

    public PedidoDTO parseToDTO(TbPedido entity){
        PedidoDTO dto = new PedidoDTO();

        if (entity == null)
            return dto;

        dto.setIdPedido(entity.getIdPedido());
        dto.setDtCompra(entity.getDtCompra());
        dto.setQtItensPedido(entity.getQtItensPedido());
        dto.setVlTotalPedido(entity.getVlTotalPedido());
        return dto;
    }

    public TbPedido parseToEntity(PedidoDTO dto, TbPedido entity){
        if (entity ==  null)
            entity = new TbPedido();

        if (dto == null)
            return entity;

        entity.setIdPedido(dto.getIdPedido());
        entity.setDtCompra(dto.getDtCompra());
        entity.setQtItensPedido(dto.getQtItensPedido());
        entity.setVlTotalPedido(dto.getVlTotalPedido());
        return entity;
    }
}

