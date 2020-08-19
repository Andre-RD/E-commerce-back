package br.com.rdevs.ecommerce.produto.model.dto;

import br.com.rdevs.ecommerce.produto.model.entity.TbProduto;
import lombok.Data;

import java.util.List;

@Data
public class CategoriaProdutoDTO {

    private Long idCategoriaProduto;

    private String dsCategoriaProduto;

    private Long idSubCategoria;

    private List<TbProduto> produtos;
}
