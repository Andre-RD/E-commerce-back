package br.com.rdevs.ecommerce.estoque.model.dto;


import br.com.rdevs.ecommerce.estoque.model.entity.TbProdutoFilialEstoque;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilialDTO {

    private Long cdFilial;
    private String nmFilial;
    private List<EstoqueDTO> estoque;



}
