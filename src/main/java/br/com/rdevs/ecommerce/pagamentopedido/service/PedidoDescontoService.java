package br.com.rdevs.ecommerce.pagamentopedido.service;

import br.com.rdevs.ecommerce.pagamentopedido.model.dto.PedidoDescontoDTO;
import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbPedidoDesconto;
import br.com.rdevs.ecommerce.pagamentopedido.repository.PedidoDescontoRepository;
import br.com.rdevs.ecommerce.pagamentopedido.service.bo.PedidoDescontoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoDescontoService {

    @Autowired
    private PedidoDescontoRepository repository;

    @Autowired
    private PedidoDescontoBO pedidoDescontoBO;

    public List<PedidoDescontoDTO> buscarTodas(){
        List<TbPedidoDesconto> listEntity = repository.findAll();
        List<PedidoDescontoDTO> listDTO = new ArrayList<>();

        for(TbPedidoDesconto entity : listEntity){
            PedidoDescontoDTO dto = pedidoDescontoBO.parseToDTO(entity);
            listDTO.add(dto);
        }
        return listDTO;
    }

    public PedidoDescontoDTO buscarporId(Long idPedido) {
        return pedidoDescontoBO.parseToDTO(repository.getOne(idPedido));
    }


}
