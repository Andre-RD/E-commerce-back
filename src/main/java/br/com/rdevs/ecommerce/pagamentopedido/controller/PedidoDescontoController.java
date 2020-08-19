package br.com.rdevs.ecommerce.pagamentopedido.controller;

import br.com.rdevs.ecommerce.pagamentopedido.service.PedidoDescontoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoDescontoController {

    private PedidoDescontoService service;

    @GetMapping("/desconto")
    public ResponseEntity buscarTodas(){
        return ResponseEntity.ok().body(service.buscarTodas());
    }


    @GetMapping("/pagamento/idPedido")
    public ResponseEntity buscarPorId(@PathVariable("idPedido") Long idPedido) {
        return ResponseEntity.ok().body(service.buscarporId(idPedido));
    }

}
