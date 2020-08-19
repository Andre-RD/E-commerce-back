package br.com.rdevs.ecommerce.produto.model.dto;

import lombok.Data;

@Data
public class ProdutoImagemDTO {

    private Long cdProduto;

    private Long idImagem;

    private String dsUrl;
}
