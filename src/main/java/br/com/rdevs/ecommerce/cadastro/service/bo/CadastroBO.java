package br.com.rdevs.ecommerce.cadastro.service.bo;

import br.com.rdevs.ecommerce.cadastro.model.dto.ClienteDTO;

import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import org.springframework.stereotype.Component;

@Component
public class CadastroBO{

    public ClienteDTO parseToDTO(TbCliente clienteEntity){
        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setIdCliente(clienteEntity.getIdCliente());
        clienteDTO.setNmCliente(clienteEntity.getNmCliente());
        clienteDTO.setNrCpf(clienteEntity.getNrCpf());
        clienteDTO.setDtNasc(clienteEntity.getDtNasc());
        clienteDTO.setDsEmail(clienteEntity.getDsEmail());
        clienteDTO.setDsGenero(clienteEntity.getDsGenero());
        clienteDTO.setNrTelefone1(clienteEntity.getNrTelefone1());

        return clienteDTO;
    }

    public TbCliente parseToEntity(ClienteDTO clienteDTO){
        TbCliente clienteEntity = new TbCliente();
        clienteEntity.setIdCliente(clienteDTO.getIdCliente());
        clienteEntity.setNmCliente(clienteDTO.getNmCliente());
        clienteEntity.setNrCpf(clienteDTO.getNrCpf());
        clienteEntity.setDtNasc(clienteDTO.getDtNasc());
        clienteEntity.setDsEmail(clienteDTO.getDsEmail());
        clienteEntity.setDsGenero(clienteDTO.getDsGenero());
        clienteEntity.setNrTelefone1(clienteDTO.getNrTelefone1());

        return clienteEntity;
    }
}
