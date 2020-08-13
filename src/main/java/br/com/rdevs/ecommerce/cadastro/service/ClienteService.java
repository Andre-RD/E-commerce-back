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


    public List<ClienteDTO> buscarTodas(){
        List<ClienteDTO> listDTO = new ArrayList<>();
        List<TbCliente> listEntity = cadastroRepository.findAll();

        for(TbCliente clienteEntity : listEntity){
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setIdCliente(clienteEntity.getIdCliente());
            clienteDTO.setNmCliente(clienteEntity.getNmCliente());
            clienteDTO.setNrCpf(clienteEntity.getNrCpf());
            clienteDTO.setDtNasc(clienteEntity.getDtNasc());
            clienteDTO.setDsEmail(clienteEntity.getDsEmail());
            clienteDTO.setDsGenero(clienteEntity.getDsGenero());
            clienteDTO.setNrTelefone1(clienteEntity.getNrTelefone1());

            List<EnderecoDTO> enderecoDTOS = new ArrayList<>();
            clienteDTO.setEnderecos(enderecoDTOS);
            for (TbEndereco endereco: clienteEntity.getEnderecos()){
                EnderecoDTO dto = new EnderecoDTO();
                dto.setIdEndereco(endereco.getIdEndereco());
                dto.setDsEndereco(endereco.getDsEndereco());
                dto.setNrEndereco(endereco.getNrEndereco());
                dto.setNrCep(endereco.getNrCep());
                dto.setDsBairro(endereco.getDsBairro());
                dto.setDsCidade(endereco.getDsCidade());
                dto.setSgEstado(endereco.getSgEstado());
                dto.setNmCompleto(endereco.getNmCompleto());

                enderecoDTOS.add(dto);

            }

            List<CartaoCreditoDTO> cartaoCreditoDTOS = new ArrayList<>();
            clienteDTO.setCartoesCreditoDTO(cartaoCreditoDTOS);

            for (TbCartaoCredito cartaoCredito: clienteEntity.getCartoesCredito()){
                CartaoCreditoDTO dtoCard = new CartaoCreditoDTO();
                dtoCard.setIdCartaoCredito(cartaoCredito.getIdCartaoCredito());
                dtoCard.setNrNumeroCartao(cartaoCredito.getNrNumeroCartao());
                dtoCard.setNmNomeTitular(cartaoCredito.getNmNomeTitular());

                cartaoCreditoDTOS.add(dtoCard);
            }

            listDTO.add(clienteDTO);
        }

        return listDTO;
    }

    public TbCliente inserir (ClienteDTO clienteInserido){
        TbCliente cliente = new TbCliente();

        cliente.setIdCliente(clienteInserido.getIdCliente());
        cliente.setNmCliente(clienteInserido.getNmCliente());
        cliente.setNrCpf(clienteInserido.getNrCpf());
        cliente.setDtNasc(clienteInserido.getDtNasc());
        cliente.setDsEmail(clienteInserido.getDsEmail());
        cliente.setDsGenero(clienteInserido.getDsGenero());
        cliente.setNrTelefone1(clienteInserido.getNrTelefone1());

        List<TbEndereco> tbEnderecos = new ArrayList<>();
        for (EnderecoDTO enderecoDTO: clienteInserido.getEnderecos()){
            TbEndereco endereco = new TbEndereco();
            endereco.setIdEndereco(enderecoDTO.getIdEndereco());
            endereco.setDsEndereco(enderecoDTO.getDsEndereco());
            endereco.setNrEndereco(enderecoDTO.getNrEndereco());
            endereco.setNrCep(enderecoDTO.getNrCep());
            endereco.setDsBairro(enderecoDTO.getDsBairro());
            endereco.setDsCidade(enderecoDTO.getDsCidade());
            endereco.setSgEstado(enderecoDTO.getSgEstado());
            endereco.setNmCompleto(enderecoDTO.getNmCompleto());

            tbEnderecos.add(endereco);
        }
        cliente.setEnderecos(tbEnderecos);

        List<TbCartaoCredito> tbCartaoCreditos = new ArrayList<>();
        for (CartaoCreditoDTO cartaoCreditoDTO: clienteInserido.getCartoesCreditoDTO()){
            TbCartaoCredito cartaoCredito = new TbCartaoCredito();

            cartaoCredito.setIdCartaoCredito(cliente.getIdCliente());
            cartaoCredito.setNrNumeroCartao(cartaoCreditoDTO.getNrNumeroCartao());
            cartaoCredito.setNmNomeTitular(cartaoCreditoDTO.getNmNomeTitular());

            cartaoCredito.setClienteCartao(cliente);

            tbCartaoCreditos.add(cartaoCredito);

        }
        cliente.setCartoesCredito(tbCartaoCreditos);

        return cadastroRepository.save(cliente);
    }
//    public  TbCartaoCredito
//
}
