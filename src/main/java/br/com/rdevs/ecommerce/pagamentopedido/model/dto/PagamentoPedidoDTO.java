package br.com.rdevs.ecommerce.pagamentopedido.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoPedidoDTO {

    private Long idPedido;

    private Long idFormaPagamento;

    private Long idDocumentoFiscal;

    private Long idTipoPagamento;

    private Long nrNumeroCartao;

    private String nmNomeTitular;




}
