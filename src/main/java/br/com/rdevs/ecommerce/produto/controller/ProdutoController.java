package br.com.rdevs.ecommerce.produto.controller;

import br.com.rdevs.ecommerce.produto.service.ProdutoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @ApiOperation(value = "Listar todos os produtos")
    @GetMapping("/produtos")
    public ResponseEntity<Object> listarTodos() {
        return ResponseEntity.ok().body(service.listarTodos());
    }
}
