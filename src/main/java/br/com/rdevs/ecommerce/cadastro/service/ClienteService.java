package br.com.rdevs.ecommerce.cadastro.service;

import br.com.rdevs.ecommerce.cadastro.model.dto.CartaoCreditoDTO;
import br.com.rdevs.ecommerce.cadastro.model.dto.ClienteDTO;
import br.com.rdevs.ecommerce.cadastro.model.dto.EnderecoDTO;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCartaoCredito;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbEndereco;
import br.com.rdevs.ecommerce.cadastro.repository.CadastroRepository;
import br.com.rdevs.ecommerce.cadastro.repository.CartaoRepository;
import br.com.rdevs.ecommerce.cadastro.repository.EnderecoRepository;
import br.com.rdevs.ecommerce.cadastro.service.bo.CadastroBO;
import br.com.rdevs.ecommerce.cadastro.service.bo.CartaoCreditoBO;
import br.com.rdevs.ecommerce.cadastro.service.bo.EnderecoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private CadastroRepository cadastroRepository;
    @Autowired
    private CartaoRepository cartaoRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private CadastroBO cadastroBO;
    @Autowired
    private EnderecoBO enderecoBO ;
    @Autowired
    private CartaoCreditoBO cartaoCreditoBO;


    public List<ClienteDTO> buscarTodas(){
        List<ClienteDTO> listDTO = new ArrayList<>();
        List<TbCliente> listEntity = cadastroRepository.findAll();

        for(TbCliente clienteEntity : listEntity){
            ClienteDTO clienteDTO = cadastroBO.parseToDTO(clienteEntity);
            List<EnderecoDTO> enderecoDTOS = new ArrayList<>();
            for (TbEndereco enderecoEntity: clienteEntity.getEnderecos()){
                EnderecoDTO dto = enderecoBO.parseToDTO(enderecoEntity);
                enderecoDTOS.add(dto);
            }
            clienteDTO.setEnderecos(enderecoDTOS);
            List<CartaoCreditoDTO> cartaoCreditoDTOS = new ArrayList<>();
            for (TbCartaoCredito cartaoCreditoEntity: clienteEntity.getCartoesCredito()){
                CartaoCreditoDTO dtoCard = cartaoCreditoBO.parseToDTO(cartaoCreditoEntity);
                cartaoCreditoDTOS.add(dtoCard);
            }
            clienteDTO.setCartoesCreditoDTO(cartaoCreditoDTOS);
            listDTO.add(clienteDTO);
        }

        return listDTO;
    }

    public List<TbCliente> buscarPorCpf(String cpf){
        return cadastroRepository.findByCpf(cpf);
    }


    public TbCliente inserir (ClienteDTO clienteDTO){
        TbCliente clienteEntity = cadastroBO.parseToEntity(clienteDTO);

        List<TbEndereco> enderecosEntitys = new ArrayList<>();
        for (EnderecoDTO enderecoDTO: clienteDTO.getEnderecos()){
            TbEndereco enderecoEntity = enderecoBO.parseToEntity(enderecoDTO);
            enderecosEntitys.add(enderecoEntity);
        }
        clienteEntity.setEnderecos(enderecosEntitys);

        List<TbCartaoCredito> cartoesCreditoEntitys = new ArrayList<>();
        for (CartaoCreditoDTO cartaoCreditoDTO: clienteDTO.getCartoesCreditoDTO()){
            TbCartaoCredito cartaoCreditoEntity = cartaoCreditoBO.parseToEntity(cartaoCreditoDTO);
            cartoesCreditoEntitys.add(cartaoCreditoEntity);
        }
        clienteEntity.setCartoesCredito(cartoesCreditoEntitys);

        return cadastroRepository.save(clienteEntity);
    }

    public TbCliente atualiza(ClienteDTO clienteDTO){
        TbCliente clienteEntity = cadastroRepository.getOne(clienteDTO.getIdCliente());
        if(clienteEntity!= null){
            clienteEntity = cadastroBO.parseToEntity()

        }

    }





}
