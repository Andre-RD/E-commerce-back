package br.com.rdevs.ecommerce.pedido.service.bo;

import br.com.rdevs.ecommerce.pedido.model.dto.PagamentoPedidoDTO;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPagamentoPedido;
import org.springframework.stereotype.Component;

@Component
public class PagamentoPedidoBO {

    public PagamentoPedidoDTO parseToDTO(TbPagamentoPedido entity){
        PagamentoPedidoDTO dto = new PagamentoPedidoDTO();

        if(entity == null)
            return dto;

        dto.setIdPedido(entity.getIdPedido());
        dto.setIdFormaPagamento(entity.getIdFormaPagamento());
        dto.setIdDocumentoFiscal(entity.getIdDocumentoFiscal());
        //dto.setIdTipoPagamento(entity.getIdTipoPagamento());
        dto.setNrNumeroCartao(entity.getNrNumeroCartao());
        dto.setNmNomeTitular(entity.getNmNomeTitular());


        return dto;
    }

    public TbPagamentoPedido parseToEntity(PagamentoPedidoDTO dto, TbPagamentoPedido entity){
        if(entity == null)
            entity = new TbPagamentoPedido();

        if (dto == null)
            return entity;

        entity.setIdPedido(dto.getIdPedido());
        entity.setIdFormaPagamento(dto.getIdFormaPagamento());
        entity.setIdDocumentoFiscal(dto.getIdDocumentoFiscal());
        //entity.setIdTipoPagamento(dto.getIdTipoPagamento());
        entity.setNrNumeroCartao(dto.getNrNumeroCartao());
        entity.setNmNomeTitular(dto.getNmNomeTitular());

        return entity;
    }
}


