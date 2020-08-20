package br.com.rdevs.ecommerce.pedido.service.bo;

import br.com.rdevs.ecommerce.pedido.model.dto.PedidoDTO;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoEntity;
import org.springframework.stereotype.Component;

@Component
public class TbPedidoBO {

    public PedidoDTO parseToDTO(TbPedidoEntity entity){
        PedidoDTO dto = new PedidoDTO();

        if (entity == null)
            return dto;

        dto.setIdPedido(entity.getIdPedido());
        dto.setIdCliente(entity.getIdCliente());
        dto.setDtCompra(entity.getDtCompra());
        dto.setCdStatusPedido(entity.getCdStatusPedido());
        dto.setQtItensPedido(entity.getQtItensPedido());
        dto.setVlCompra(entity.getVlCompra());
        dto.setVlTotalPedido(entity.getVlTotalPedido());
        return dto;
    }

    public TbPedidoEntity parseToEntity(PedidoDTO dto, TbPedidoEntity entity){
        if (entity ==  null)
            entity = new TbPedidoEntity();

        if (dto == null)
            return entity;

        entity.setIdPedido(dto.getIdPedido());
        entity.setIdCliente(dto.getIdCliente());
        entity.setDtCompra(dto.getDtCompra());
        entity.setCdStatusPedido(dto.getCdStatusPedido());
        entity.setQtItensPedido(dto.getQtItensPedido());
        entity.setVlCompra(dto.getVlCompra());
        entity.setVlTotalPedido(dto.getVlTotalPedido());
        return entity;
    }
}

