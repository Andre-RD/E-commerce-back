package br.com.rdevs.ecommerce.produto.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_PRODUTO")
@Data
public class TbProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_PRODUTO")
    private Long cdProduto;

    @Column(name = "ID_STATUS_PRODUTO")
    private Long idStatusPorduto;

    @Column(name = "NM_FANTASIA")
    private String nomeFantasia;

    @Column(name = "NM_FABRICANTE")
    private String nomeFabricante;

    @Column(name = "VL_UNIDADE")
    private BigDecimal valorUnidade;

    @Column(name = "DS_ALTURA")
    private String dsAltura;

    @Column(name = "DS_PESO")
    private String dsPeso;

    @Column(name = "DS_LARGURA")
    private String dsLargura;

    @OneToMany(mappedBy = "produtoImagem", cascade = CascadeType.ALL)
    private List<TbProdutoImagem> imagens;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_PRODUTO")
    @JsonIgnore
    private TbTipoProduto tipoProduto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEGORIA")
    @JsonIgnore
    private TbCategoriaProduto categoriaProduto;
}
