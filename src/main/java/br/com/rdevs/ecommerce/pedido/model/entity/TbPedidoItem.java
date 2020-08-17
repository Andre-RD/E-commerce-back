package br.com.rdevs.ecommerce.pedido.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "TB_PEDIDO_ITEM")

public class TbPedidoItem implements Serializable {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;

    @Id
    @Column(name = "NR_ITEM_PEDIDO")
    private Integer nrItemPedido;

    @Column(name = "VL_PEDIDO_ITEM")
    private BigDecimal vlPedidoItem;

        //Tabela do Gutemberg
//    @OneToOne//O item cdProduto é FK
//    @JoinColumn(name = "TB_PRODUTO")
//    private Integer cdProduto;
}
