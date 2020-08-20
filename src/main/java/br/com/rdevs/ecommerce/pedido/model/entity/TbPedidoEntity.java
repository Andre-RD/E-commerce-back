package br.com.rdevs.ecommerce.pedido.model.entity;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
@Table(name = "TB_PEDIDO")
public class TbPedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @Column(name = "DT_COMPRA")
    private Date dtCompra;

    @Column(name = "VL_FRETE")
    private BigDecimal vlCompra;

    @Column(name = "VL_TOTAL_PEDIDO")
    private BigDecimal vlTotalPedido;

    @Column(name = "QT_ITENS_PEDIDO")
    private Integer qtItensPedido;

    @Column(name = "TB_CLIENTE")
    private Integer idCliente;

    @Column(name = "TB_STATUS_PEDIDO")
    private Integer cdStatusPedido;

    @ManyToOne//O item idCliente é uma FK
    @JoinColumn(name = "ID_CLIENTE")
    private TbCliente tbCliente;

    @OneToOne//O item cdStatusPedido é FK
    @JoinColumn(name = "CD_STATUS_PEDIDO")
    private TbStatusPedidoEntity statusPedidoEntity;
}
