package br.com.rdevs.ecommerce.pagamentopedido.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Data
@Table(name = "TB_ECOMM_CUPOM_DESCONTO")
public class TbEcommCupomDesconto {

    @Id
    @Column(name = "ID_ECOMM_CUPOM_DESCONTO")
    private Long idEcommCupomDesconto;

    @Column(name = "DS_ECOMM_CUPOM_DESCONTO")
    private String dsEcommCupomDesconto;

    @Column(name = "DT_VALIDADE")
    private Date dtValidade;
}
