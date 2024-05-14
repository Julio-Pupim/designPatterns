package org.example.estrutural;

public class Iphone4Carregador implements CarregadorAdapter{

public Iphone4Carregador(){}
    @Override
    public void carregando() {

        System.out.println("Carregando com o carregador do iphone 4!");
    }
}
