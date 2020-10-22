package br.com.marcos.microservice.loja.service;

import br.com.marcos.microservice.loja.controller.dto.CompraDto;
import br.com.marcos.microservice.loja.controller.dto.InfoFornecedorDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    public void realizaCompra(CompraDto compra) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<InfoFornecedorDto> exchange = client.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET, null, InfoFornecedorDto.class);


    }
}
