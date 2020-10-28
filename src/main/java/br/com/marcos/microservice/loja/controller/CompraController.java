package br.com.marcos.microservice.loja.controller;

import br.com.marcos.microservice.loja.controller.dto.CompraDto;
import br.com.marcos.microservice.loja.model.Compra;
import br.com.marcos.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @RequestMapping(method = RequestMethod.POST)
    public Compra realizaCompra(@RequestBody CompraDto compra){
        return compraService.realizaCompra(compra);

    }
}
