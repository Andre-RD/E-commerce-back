package br.com.rdevs.ecommerce.cadastro.service;
import br.com.rdevs.ecommerce.cadastro.model.dto.ClienteDTO;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCartaoCredito;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import br.com.rdevs.ecommerce.cadastro.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private CadastroRepository repository;


    public List<TbCliente> buscarTodas(){
        List<TbCliente> listEntity = repository.findAll();
        return listEntity;
    }

}
