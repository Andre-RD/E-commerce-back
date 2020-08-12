package br.com.rdevs.ecommerce.cadastro.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CARTAO_CREDITO")
@Data
public class TbCartaoCredito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CARTAO_CREDITO")
    private Long idCartaoCredito;
    @Column(name = "NR_NUMERO_CARTAO")
    private Long nrNumeroCartao;
    @Column(name = "NM_NOME_TITULAR")
    private String nmNomeTitular;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE")
    @JsonIgnore
    private TbCliente clienteCartao;

}
