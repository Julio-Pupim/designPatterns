package org.example.criacional;

public class CarrinhoDeCompraSingleton {

    private static CarrinhoDeCompraSingleton instance;
    public Double valor;
    public Integer itens;

    private CarrinhoDeCompraSingleton(Double valor, Integer itens) {

        this.valor = valor;
        this.itens = itens;
    }
    public static CarrinhoDeCompraSingleton getInstance(Double valor, Integer itens) {
        if (instance == null) {
            instance = new CarrinhoDeCompraSingleton(valor, itens);
        }
        return instance;
    }
}
