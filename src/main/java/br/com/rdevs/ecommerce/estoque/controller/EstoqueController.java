package br.com.rdevs.ecommerce.estoque.controller;


import br.com.rdevs.ecommerce.estoque.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstoqueController {


    @Autowired
    private EstoqueService service;

    // LISTAR TODOS OS ESTOQUES DE TODAS AS FILIAIS
    @GetMapping("/estoque")
    public ResponseEntity<Object> listarTodas(){
        return ResponseEntity.ok().body(service.buscarTodas());
    }

    // LISTAR AS FILIIAS QUE POSSUEM UM PRODUTO EM ESTOQUE


    // LISTAR O ESTOQUE TOTAL DE UM PRODUTO




    }

