package br.com.rdevs.ecommerce.cadastro.model.dto;

import lombok.Data;


@Data
public class CartaoCreditoDTO {

    private Long idCartaoCredito;

    private Long nrNumeroCartao;

    private String nmNomeTitular;

}
