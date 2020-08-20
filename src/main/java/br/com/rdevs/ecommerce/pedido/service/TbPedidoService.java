package br.com.rdevs.ecommerce.pedido.service;
//Classe para inserir as regras de negócio e metodos a serem inseridos na classe Controller
import br.com.rdevs.ecommerce.pedido.model.dto.PedidoDTO;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoEntity;
import br.com.rdevs.ecommerce.pedido.repository.PedidoRepository;
import br.com.rdevs.ecommerce.pedido.service.bo.TbPedidoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TbPedidoService {
    //implementar inclusão, exclusão e consulta
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private TbPedidoBO pedidoBO;

    //Método de buscar Pedidos
    public List<PedidoDTO> buscarPedidos(){
        List<TbPedidoEntity> listEntity = repository.findAll();
        List<PedidoDTO> listDTO = new ArrayList<>();

        for (TbPedidoEntity entity : listEntity){
            PedidoDTO dto = pedidoBO.parseToDTO(entity);
            listDTO.add(dto);
        }
        return listDTO;
    }//ok

    //Método de inserir Pedidos
    public void inserirPedidos(PedidoDTO dto){
        TbPedidoEntity entity = repository.getOne(dto.getIdPedido());
        if (entity != null){
            entity = pedidoBO.parseToEntity(dto, entity);
            repository.save(entity);
        }
        
    }
    }
