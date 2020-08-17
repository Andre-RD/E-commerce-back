package br.com.rdevs.ecommerce.pedido.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusPedidoDTO {
    private Integer cdStatusPedido;
    private String dsStatusPedido;
}
