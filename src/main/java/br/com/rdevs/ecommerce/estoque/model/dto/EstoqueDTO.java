package br.com.rdevs.ecommerce.estoque.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
