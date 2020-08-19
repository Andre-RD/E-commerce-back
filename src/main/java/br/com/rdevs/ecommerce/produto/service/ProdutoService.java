package br.com.rdevs.ecommerce.produto.service;

import br.com.rdevs.ecommerce.produto.model.dto.CategoriaProdutoDTO;
import br.com.rdevs.ecommerce.produto.model.dto.ProdutoDTO;
import br.com.rdevs.ecommerce.produto.model.dto.TipoProdutoDTO;
import br.com.rdevs.ecommerce.produto.model.entity.TbProduto;
import br.com.rdevs.ecommerce.produto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    @PersistenceContext
    private EntityManager em;

    public List<ProdutoDTO> listarTodos() {

        List<ProdutoDTO> listaDTO = new ArrayList<>();

        List<TbProduto> listaEntity = produtoRepository.findAll();
        for(TbProduto prod : listaEntity) {
            ProdutoDTO dto = new ProdutoDTO();
            CategoriaProdutoDTO catdto = new CategoriaProdutoDTO();
            TipoProdutoDTO tipdto = new TipoProdutoDTO();

            catdto.setIdCategoriaProduto(prod.getCategoriaProduto().getIdCategoriaProduto());
            catdto.setDsCategoriaProduto(prod.getCategoriaProduto().getDsCategoriaProduto());

            tipdto.setIdTipoProduto(prod.getTipoProduto().getIdTipoProduto());
            tipdto.setDsTipoProduto(prod.getTipoProduto().getDsTipoProduto());

            dto.setCdProduto(prod.getCdProduto());
            dto.setIdStatusPorduto(prod.getIdStatusPorduto());
            dto.setCategoriaProduto(catdto);
            dto.setTipoProduto(tipdto);
            dto.setNomeFantasia(prod.getNomeFantasia());
            dto.setNomeFabricante(prod.getNomeFabricante());
            dto.setValorUnidade(prod.getValorUnidade());
            dto.setDsAltura(prod.getDsAltura());
            dto.setDsLargura(prod.getDsLargura());
            dto.setDsPeso(prod.getDsPeso());

            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
