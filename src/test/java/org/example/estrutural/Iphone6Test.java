package org.example.estrutural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Iphone6Test {

    @Test
    public void deveCarregarComIphone4(){
        Iphone6 iphone6 = new Iphone6(new Iphone4To6Adapter());
        assertDoesNotThrow(()->iphone6.carregar());
    }

}