package br.com.rdevs.ecommerce.pedido.model.entity;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
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

    @ManyToOne//O item idCliente é uma FK
    @JoinTable(name = "TB_CLIENTE",
            joinColumns = @JoinColumn(name = "ID_PEDIDO"),
            inverseJoinColumns = @JoinColumn(name = "ID_CLIENTE")
    )
    private TbCliente tbCliente;

    @OneToOne//O item cdStatusPedido é FK
    @JoinTable(name = "TB_STATUS_PEDIDO",
            joinColumns = @JoinColumn(name = "ID_PEDIDO"),
            inverseJoinColumns = @JoinColumn(name = "ID_CLIENTE")
    )
    private TbStatusPedidoEntity statusPedidoEntity;
}
