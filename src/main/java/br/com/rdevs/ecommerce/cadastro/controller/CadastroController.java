package br.com.rdevs.ecommerce.cadastro.controller;

import br.com.rdevs.ecommerce.cadastro.model.dto.ClienteDTO;
import br.com.rdevs.ecommerce.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CadastroController {

    @Autowired
    private ClienteService service;


    @GetMapping("/listaCadastros")
    public ResponseEntity buscarCadastros(){
        return ResponseEntity.ok().body(service.buscarTodas());
    }

    @PostMapping("/listaCadastros")
    public ResponseEntity<Object> salvarCadastro(@RequestBody ClienteDTO clienteDTO){

    }










}
