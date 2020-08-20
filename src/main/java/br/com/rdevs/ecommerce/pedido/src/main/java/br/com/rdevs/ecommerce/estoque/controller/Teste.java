package br.com.rdevs.ecommerce.estoque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {
    @GetMapping("/teste")
    public  String obterBemVindo(){
        return "Bem vindo a Spring Boot";
    }
}