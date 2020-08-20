package br.com.rdevs.ecommerce.estoque.service;


import br.com.rdevs.ecommerce.estoque.model.dto.EstoqueDTO;
import br.com.rdevs.ecommerce.estoque.model.dto.FilialDTO;
import br.com.rdevs.ecommerce.estoque.model.entity.TbFilial;
import br.com.rdevs.ecommerce.estoque.model.entity.TbProdutoFilialEstoque;
import br.com.rdevs.ecommerce.estoque.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private FilialRepository repository;



    public List<FilialDTO> buscarTodas(){

        List<FilialDTO> listaDTO = new ArrayList<>();
        List<TbFilial> listaEntity =  repository.findAll();

        for(TbFilial produtoEstoque : listaEntity){
            FilialDTO filialEStoque = new FilialDTO();


            filialEStoque.setCdFilial(produtoEstoque.getCdFilial());
            filialEStoque.setNmFilial(produtoEstoque.getNmFilial());



            List<EstoqueDTO> produtos = new ArrayList<>();

            for(TbProdutoFilialEstoque prod : produtoEstoque.getEstoque()){
                EstoqueDTO estDTO = new EstoqueDTO();

                estDTO.setCdProduto(prod.getProduto().getCdProduto());
                estDTO.setCdCategoria(prod.getProduto().getCategoriaProduto().getIdCategoriaProduto());
                estDTO.setDsProduto(prod.getProduto().getNomeFantasia());
                estDTO.setQtEstoque(prod.getQtEstoque());
                estDTO.setQtEmpenho(prod.getQtEmpenho());

                produtos.add(estDTO);
            }

            filialEStoque.setEstoque(produtos);

            listaDTO.add(filialEStoque);
      }

        return listaDTO;
    }




/*
            List<FilialDTO> listaDTO = new ArrayList<>();
        List<TbFilial> listaEntity =  repository.findAll();

        for(TbFilial produtoEstoque : listaEntity){
            FilialDTO filialEStoque = new FilialDTO();

            filialEStoque.setCdFilial(produtoEstoque.getCdFilial());
            filialEStoque.setNmFilial(produtoEstoque.getNmFilial());

            List<EstoqueDTO> produtos = new ArrayList<>();

            for(TbProdutoFilialEstoque prod : produtoEstoque.getProdutos()){
                EstoqueDTO estDTO = new EstoqueDTO();

                estDTO.setCdProduto(prod.getCdProduto().getCdProduto());
                estDTO.setCdCategoria(prod.getCdProduto().getCdCategoria());
                estDTO.setDsProduto(prod.getCdProduto().getDsProduto());
                estDTO.setQtEstoque(prod.getQtEstoque());
                estDTO.setQtEmpenho(prod.getQtEmpenho());

                produtos.add(estDTO);
            }

            filialEStoque.setEstoque(produtos);

            listaDTO.add(filialEStoque);
        }

        return listaDTO;
    }

*/



/*
    public List<EstoqueDTO> buscarTodas(){

        List<EstoqueDTO> listaDTO = new ArrayList<>();
        List<TbProdutoFilialEstoque> listaEntity =  repository.findAll();

        for(TbProdutoFilialEstoque produtoEstoque : listaEntity){
            EstoqueDTO dto = new EstoqueDTO();

            dto.setIdFilial(produtoEstoque.getCdFilial());

            List<ProdutoDTO> produtos = new ArrayList<>();

            for(TbProduto prod : produtoEstoque.getProdutos()){
                ProdutoDTO priDTO = new ProdutoDTO();
                priDTO.setCdCategoria(prod.getCdCategoria());
                priDTO.setCdProduto(prod.getCdProduto());
                priDTO.setDsProduto(prod.getDsProduto());
                priDTO.setQtEstoque(produtoEstoque.getQtEstoque());
                priDTO.setQtEmpenho(produtoEstoque.getQtEmpenho());

                produtos.add(priDTO);
            }

            dto.setProdutos(produtos);
            listaDTO.add(dto);
        }

        return listaDTO;
    }

*/




}
