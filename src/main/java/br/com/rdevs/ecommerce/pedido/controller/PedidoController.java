package br.com.rdevs.ecommerce.pedido.controller;

import br.com.rdevs.ecommerce.pedido.service.TbPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {

@Autowired
private TbPedidoService service;

@GetMapping("/pedidos")
    public ResponseEntity buscarPedidos(){
    return ResponseEntity.ok().body(service.buscarPedidos());
}

@GetMapping("/pedidos/{codigo}")
    public ResponseEntity buscaPorId(@PathVariable("codigo") Integer codigo){
    return ResponseEntity.ok().body(service.buscaPorId(codigo));
}
}
