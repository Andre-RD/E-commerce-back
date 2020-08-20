package br.com.rdevs.ecommerce.pedido.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TB_STATUS_PEDIDO")

public class TbStatusPedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_STATUS_PEDIDO")
    private Integer cdStatusPedido;

    @Column(name = "DS_STATUS_PEDIDO")
    private String dsStatusPedido;
}
