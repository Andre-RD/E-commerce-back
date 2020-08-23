package br.com.rdevs.ecommerce.pedido.service;
//Classe para inserir as regras de negócio e metodos a serem inseridos na classe Controller
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import br.com.rdevs.ecommerce.cadastro.repository.CadastroRepository;
import br.com.rdevs.ecommerce.pedido.model.dto.PedidoDTO;
import br.com.rdevs.ecommerce.pedido.model.dto.PedidoItemDTO;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedido;
import br.com.rdevs.ecommerce.pedido.model.entity.TbPedidoItem;
import br.com.rdevs.ecommerce.pedido.model.entity.TbStatusPedido;
import br.com.rdevs.ecommerce.pedido.repository.PedidoRepository;
import br.com.rdevs.ecommerce.pedido.service.bo.TbPedidoBO;
import br.com.rdevs.ecommerce.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class TbPedidoService {
    //implementar inclusão, exclusão e consulta
    @Autowired
    private PedidoRepository repository;

    @Autowired
    private CadastroRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private TbPedidoBO pedidoBO;


    @PersistenceContext
    private EntityManager em;

    //Método de buscar Pedidos pela id do cliente
    public List<TbPedido> buscarPedidoPorIdCliente(Long idCliente) {
        return em.createNamedQuery("buscarPedidoPorIdCliente", TbPedido.class).setParameter("idCliente", idCliente).getResultList();
    }

    //Método de inserir Pedidos
    public TbPedido inserirPedido(PedidoDTO dto) throws Exception{
        TbCliente cliente = clienteRepository.getOne(dto.getIdCliente());
        if(cliente == null || cliente.getNmCliente().isEmpty()) {
            throw new Exception("IdCliente: " + dto.getIdCliente() + " não encontrado!");
        }
        TbPedido pedidoEntity = new TbPedido();
        TbStatusPedido statusPedido = new TbStatusPedido();

        pedidoEntity = pedidoBO.parseToEntity(dto, pedidoEntity);
        pedidoEntity.setCliente(cliente);
        statusPedido.setCdStatusPedido(statusPedido.getCdStatusPedido());
        statusPedido.setDsStatusPedido(statusPedido.getDsStatusPedido());
        pedidoEntity.setStatusPedido(statusPedido);

        List<TbPedidoItem> itemsEntity = new ArrayList<>();
        for(PedidoItemDTO itemDTO : dto.getItems()){
            TbPedidoItem itemEntity = new TbPedidoItem();
            itemEntity.setNrItemPedido(itemDTO.getNrItemPedido());
            itemEntity.setProduto(produtoRepository.getOne(itemDTO.getCdProduto()));
            itemEntity.setVlPedidoItem(itemDTO.getVlPedidoItem());

            itemEntity.setPedido(pedidoEntity);
            itemsEntity.add(itemEntity);
        }

        pedidoEntity.setItens(itemsEntity);
        return repository.save(pedidoEntity);
        }
    }
