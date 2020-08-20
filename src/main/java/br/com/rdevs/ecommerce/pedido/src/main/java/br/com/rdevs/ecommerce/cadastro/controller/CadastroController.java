package br.com.rdevs.ecommerce.cadastro.controller;

import br.com.rdevs.ecommerce.cadastro.model.dto.ClienteDTO;
import br.com.rdevs.ecommerce.cadastro.model.dto.ResultData;
import br.com.rdevs.ecommerce.cadastro.model.entity.TbCliente;
import br.com.rdevs.ecommerce.cadastro.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;


@RestController
public class CadastroController {

    @Autowired
    private ClienteService service;


    @GetMapping("/listaCadastros")
    @RolesAllowed(value = "ADMIN")
    public ResponseEntity buscarCadastros(){
        return ResponseEntity.ok().body(service.buscarTodas());
    }



    @PostMapping("/listaCadastros")
    @RolesAllowed(value = "ADMIN")
    public ResponseEntity<Object> salvarCadastro(@RequestBody ClienteDTO clienteDTO) throws Exception {
        ResultData resultData = null;

        if(resultData != null)
            return ResponseEntity.badRequest().body(resultData);
        else {
            try {
                TbCliente tbCliente = service.inserir(clienteDTO);
                resultData = new ResultData<TbCliente>(HttpStatus.OK.value(), "Cliente registrada com sucesso!", tbCliente);
                return ResponseEntity.status(HttpStatus.CREATED).body(resultData);
            }catch(Exception e){
                resultData = new ResultData(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Ocorreu um erro ao registrar cliente", e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(resultData);
            }
        }
    }





}
