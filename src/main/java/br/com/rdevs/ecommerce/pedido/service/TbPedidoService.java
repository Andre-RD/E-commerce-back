package br.com.rdevs.ecommerce.pedido.service;
//Classe para inserir as regras de negócio e metodos a serem inseridos na classe Controller
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoEntity;
import br.com.rdevs.ecommerce.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbPedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<TbPedidoEntity> buscarPedidos(){
        List<TbPedidoEntity> listEntity = repository.findAll();
        return listEntity;
    }

    public Object buscaPorId(Integer codigo) {
        List<TbPedidoEntity> listEntity = repository.findAll();
        return listEntity;
    }
}
