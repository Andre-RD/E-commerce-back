package br.com.rdevs.ecommerce.pagamentopedido.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommCupomDescontoController {

    private EcommCupomDescontoService service;


    public ResponseEntity<Object> listarTodas(){return ResponseEntity.ok().body(service.listarTodas()); }

}
