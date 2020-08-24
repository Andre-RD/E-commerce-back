package br.com.rdevs.ecommerce.pedido.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoItemDTO {

    private Long idPedido;
    private Long nrItemPedido;
    private Long cdProduto;
    private BigDecimal vlPedidoItem;
}
