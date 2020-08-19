package br.com.rdevs.ecommerce.pagamentopedido.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "TB_PAGAMENTO_PEDIDO")
public class TbPagamentoPedido implements Serializable {

    @Id
    @Column(name = "ID_PEDIDO")
    private Long idPedido;


    @Column(name = "ID_FORMA_PAGAMENTO")
    private Long idFormaPagamento;

    @Column(name = "ID_DOCUMENTO_FISCAL")
    private Long idDocumentoFiscal;

    @OneToOne
    @JoinColumn(name = "ID_TIPO_PAGAMENTO")
    private TbTipoPagamento idTipoPagamento;

    @OneToOne
    @JoinColumn(name = "NR_NUMERO_CARTAO")
    private Long nrNumeroCartao;

    @Column(name = "NM_NOME_TITULAR")
    private String nmNomeTitular;
}