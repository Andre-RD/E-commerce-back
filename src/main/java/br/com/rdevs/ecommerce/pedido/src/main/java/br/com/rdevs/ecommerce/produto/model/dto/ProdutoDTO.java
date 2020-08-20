package br.com.rdevs.ecommerce.produto.model.dto;

import br.com.rdevs.ecommerce.produto.model.entity.TbCategoriaProduto;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProdutoDTO {

    private Long cdProduto;

    private Long idStatusPorduto;

    private CategoriaProdutoDTO categoriaProduto;

    private TipoProdutoDTO tipoProduto;

    private String nomeFantasia;

    private String nomeFabricante;

    private BigDecimal valorUnidade;

    private String dsAltura;

    private String dsPeso;

    private String dsLargura;

    private Long idImagem;
}
