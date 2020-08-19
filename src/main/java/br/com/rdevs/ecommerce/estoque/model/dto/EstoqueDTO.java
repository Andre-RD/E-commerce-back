package br.com.rdevs.ecommerce.estoque.model.dto;


import br.com.rdevs.ecommerce.estoque.model.entity.TbFilial;

import br.com.rdevs.ecommerce.estoque.model.entity.TbProduto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueDTO {

    private Long cdProduto;
    private Long cdCategoria;
    private String dsProduto;

    private Long qtEstoque;
    private Long qtEmpenho;

}
