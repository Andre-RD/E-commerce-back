package br.com.rdevs.ecommerce.pedido.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoItemDTO {

    private Integer idPedido;
    private Integer nrItemPedido;
    private BigDecimal vlPedidoItem;
}
