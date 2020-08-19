package br.com.rdevs.ecommerce.pagamentopedido.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoPagamentoDTO {

    private Long idTipoPagamento;

    private String dsTipoPagamento;
}
