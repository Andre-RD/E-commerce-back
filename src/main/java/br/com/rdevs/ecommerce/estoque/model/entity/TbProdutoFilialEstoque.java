package br.com.rdevs.ecommerce.estoque.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="TB_PRODUTO_FILIAL_ESTOQUE")
@Data
public class TbProdutoFilialEstoque implements Serializable{


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CD_ESTOQUE")
    private Long cdEstoque;


    @Column(name = "CD_FILIAL")
    private Long cdFilial;

    @OneToOne
    @JoinColumn(name = "CD_PRODUTO")
    private TbProduto produto;

    @Column(name = "QT_ESTOQUE")
    private Long qtEstoque;

    @Column(name = "QT_EMPENHO")
    private Long qtEmpenho;


}
