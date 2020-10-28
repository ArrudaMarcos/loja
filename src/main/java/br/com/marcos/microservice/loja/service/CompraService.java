package br.com.marcos.microservice.loja.service;

import br.com.marcos.microservice.loja.client.FornecedorClient;
import br.com.marcos.microservice.loja.controller.dto.CompraDto;
import br.com.marcos.microservice.loja.controller.dto.InfoFornecedorDto;
import br.com.marcos.microservice.loja.controller.dto.InfoPedidoDto;
import br.com.marcos.microservice.loja.model.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;

    public Compra realizaCompra(CompraDto compra) {

        InfoFornecedorDto info =  fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());

        InfoPedidoDto pedido = fornecedorClient.realizaPedido(compra.getItens());

        Compra compraSalva = new Compra();
        compraSalva.setPedidoId(pedido.getId());
        compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
        compraSalva.setEnderecoDestino(compra.getEndereco().toString());

        return compraSalva;
    }
}
