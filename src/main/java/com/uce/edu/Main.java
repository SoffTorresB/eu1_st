package com.uce.edu;

import com.uce.edu.extensiones.DescuentoAdicionalExtension;
import com.uce.edu.extensiones.DescuentoExtension;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Pedido pedido;
    @Inject
    PedidoService pedidoService;

    @Inject
    DescuentoExtension descuentoExtension;

    @Inject
    DescuentoAdicionalExtension descuentoAdicionalExtension;

    public static void main(String[] args) {

        Quarkus.run(Main.class, args);

    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("INICIO_EVALUACION");
        System.out.println("PEDIDO: ");
        System.out.println("NOTIFICACION: ");
        System.out.println("DURACION: ");
        System.out.println("172219-st");
        

        return 0;
    }

}
