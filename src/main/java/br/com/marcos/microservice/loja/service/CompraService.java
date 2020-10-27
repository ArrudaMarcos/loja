package br.com.marcos.microservice.loja.service;

import br.com.marcos.microservice.loja.client.FornecedorClient;
import br.com.marcos.microservice.loja.controller.dto.CompraDto;
import br.com.marcos.microservice.loja.controller.dto.InfoFornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;

    public void realizaCompra(CompraDto compra) {

        fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
    }
}
