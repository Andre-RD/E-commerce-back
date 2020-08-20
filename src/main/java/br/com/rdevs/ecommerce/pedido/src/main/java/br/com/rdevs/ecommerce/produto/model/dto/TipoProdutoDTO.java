package br.com.rdevs.ecommerce.produto.model.dto;

import br.com.rdevs.ecommerce.produto.model.entity.TbProduto;
import lombok.Data;
import java.util.List;

@Data
public class TipoProdutoDTO {
    private Long idTipoProduto;

    private String dsTipoProduto;

    private List<TbProduto> produtos;
}
