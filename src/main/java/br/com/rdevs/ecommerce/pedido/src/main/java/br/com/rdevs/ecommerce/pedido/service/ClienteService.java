package br.com.rdevs.ecommerce.pedido.service;

import br.com.rdevs.ecommerce.pedido.model.entity.TbCliente;
import br.com.rdevs.ecommerce.pedido.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private CadastroRepository repository;


    public List<TbCliente> buscarTodas(){
        return (List<TbCliente>) repository.findAll();
    }

}
