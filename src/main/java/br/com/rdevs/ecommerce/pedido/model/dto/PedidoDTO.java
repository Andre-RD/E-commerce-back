package br.com.rdevs.ecommerce.pedido.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
    private Long idPedido;
    private Date dtCompra;
    private BigDecimal vlCompra;
    private BigDecimal vlTotalPedido;
    private Integer qtItensPedido;
    private Integer idCliente;
    private Integer cdStatusPedido;
}
