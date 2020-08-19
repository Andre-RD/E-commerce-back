package br.com.rdevs.ecommerce.produto.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "TB_CATEGORIA_PRODUTO")
@Data
public class TbCategoriaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Long idCategoriaProduto;

    @Column(name = "DS_CATEGORIA")
    private String dsCategoriaProduto;

    @Column(name = "ID_SUB_CATEGORIA")
    private Long idSubCategoria;

    @OneToMany(mappedBy = "categoriaProduto", cascade = CascadeType.ALL)
    private List<TbProduto> produtos;
}
