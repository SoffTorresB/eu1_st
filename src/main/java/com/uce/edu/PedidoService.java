package com.uce.edu;

import com.uce.edu.interceptores.MedirTiempo;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@MedirTiempo // 1

public class PedidoService {

    public PedidoService() {
    }

    public String realizar(Pedido pedido, String valor) {

      
        
        System.out.println("realizando pedido...");

        System.out.println("PEDIDO: " + pedido.getCodigo()+"TOTAL: "+pedido.getValor());


        return "Pedido realizado con éxito";

    }
}

