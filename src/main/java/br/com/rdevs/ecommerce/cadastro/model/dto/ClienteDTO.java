package br.com.rdevs.ecommerce.cadastro.model.dto;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbEndereco;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ClienteDTO {

    private Long idCliente;
    private String nmCliente;
    private String nrCpf;
    private String dsEmail;
    private Date dtNasc;
    private String dsGenero;
    private String nrTelefone1;

    private List<EnderecoDTO> enderecos;

    private  List<CartaoCreditoDTO> cartoesCreditoDTO;

}
