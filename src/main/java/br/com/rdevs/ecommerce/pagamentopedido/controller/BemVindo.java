package br.com.rdevs.ecommerce.pagamentopedido.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindo {
    @GetMapping("/bemvindo")
    public  String obterBemVindo(){
        return "Bem vindo a Spring Boot";
    }
}