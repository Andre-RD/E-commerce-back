package br.com.rdevs.ecommerce.pagamentopedido.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EcommCupomDescontoDTO {

    private Long idEcommCupomDesconto;

    private String dsEcommCupomDesconto;

    private Date dtValidade;
}
