package br.com.rdevs.ecommerce.pagamentopedido.service;

import br.com.rdevs.ecommerce.pagamentopedido.model.dto.PagamentoPedidoDTO;
import br.com.rdevs.ecommerce.pagamentopedido.model.entity.TbPagamentoPedido;
import br.com.rdevs.ecommerce.pagamentopedido.repository.PagamentoPedidoRepository;
import br.com.rdevs.ecommerce.pagamentopedido.service.bo.PagamentoPedidoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PagamentoPedidoService {

    @Autowired
    private PagamentoPedidoRepository repository;

    @Autowired
    private PagamentoPedidoBO pagamentoPedidoBO;

    public List<PagamentoPedidoDTO> buscarTodas(){
        List<TbPagamentoPedido> listEntity = repository.findAll();
        List<PagamentoPedidoDTO> listDTO = new ArrayList<>();

        for(TbPagamentoPedido entity : listEntity){
            PagamentoPedidoDTO dto = pagamentoPedidoBO.parseToDTO(entity);
            listDTO.add(dto);
        }
        return listDTO;
    }

    public PagamentoPedidoDTO buscarporId(Long idPedido) {
        return pagamentoPedidoBO.parseToDTO(repository.getOne(idPedido));
    }

        public void inserir(PagamentoPedidoDTO dto){
            TbPagamentoPedido entity = pagamentoPedidoBO.parseToEntity(dto,null);
            if (entity.getIdPedido() !=null)
                repository.save(entity);

        }
   public List<TbPagamentoPedido> buscarPorNome(String nome){
        return repository.findByNome(nome);
   }
}
