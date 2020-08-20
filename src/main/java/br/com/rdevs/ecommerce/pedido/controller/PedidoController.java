package br.com.rdevs.ecommerce.pedido.controller;

import br.com.rdevs.ecommerce.pedido.model.dto.PedidoDTO;
import br.com.rdevs.ecommerce.pedido.service.TbPedidoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {

@Autowired
private TbPedidoService service;

@ApiOperation(value = "Listar todos os pedidos")
@GetMapping("/pedidos")
    public ResponseEntity buscarPedidos(){
    return ResponseEntity.ok().body(service.buscarPedidos());
}

@ApiOperation(value = "Incluir novo pedido")
@PostMapping("/incluir")
    public ResponseEntity incluirPedido(@RequestBody PedidoDTO dto){
    service.inserirPedidos(dto);
    return ResponseEntity.ok().body(dto);
}
}

