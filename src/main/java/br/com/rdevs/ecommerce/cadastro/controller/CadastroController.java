package br.com.rdevs.ecommerce.cadastro.controller;

import br.com.rdevs.ecommerce.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CadastroController {

    @Autowired
    private ClienteService service;

    @GetMapping("/cadastro")
    public ResponseEntity buscarCadastros(){
        return ResponseEntity.ok().body(service.buscarTodas());
    }

}
