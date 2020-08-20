package br.com.rdevs.ecommerce.pagamentopedido.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "TB_TIPO_PAGAMENTO")
public class TbTipoPagamento {

    @Id
    @Column(name = "ID_TIPO_PAGAMENTO")
    private Long  idTipoPagamento;

    @Column(name = "DS_TIPO_PAGAMENTO")
    private String dsTipoPagamento;
}
