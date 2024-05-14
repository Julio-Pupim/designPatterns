package org.example.criacional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeCompraSingletonTest {

    @Test
    public void naoDeveCriarMaisQueUmObjeto(){

        CarrinhoDeCompraSingleton carrinhoDeCompra =  CarrinhoDeCompraSingleton.getInstance(100.0, 4);
        CarrinhoDeCompraSingleton carrinhoDeCompra2 =  CarrinhoDeCompraSingleton.getInstance(140.0, 2);

        assertEquals(carrinhoDeCompra, carrinhoDeCompra2);
    }
}

