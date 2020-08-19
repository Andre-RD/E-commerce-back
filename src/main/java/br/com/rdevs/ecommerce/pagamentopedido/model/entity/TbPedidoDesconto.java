package br.com.rdevs.ecommerce.pagamentopedido.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table (name = "TB_PEDIDO_DESCONTO")
public class TbPedidoDesconto {

    @Id
    @Column(name = "ID_PEDIDO_DESCONTO")
    private Long idPedidoDesconto;

    @Column(name = "ID_ECOMM_CUPOM_DESCONTO")
    private Long  idEcommCupomDesconto;
}
