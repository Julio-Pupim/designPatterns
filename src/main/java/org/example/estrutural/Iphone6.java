package org.example.estrutural;

public class Iphone6 implements IphoneCarregador
{
    IphoneCarregador Iphone4sTo6sAdapter;
    public Iphone6(IphoneCarregador iphone4sTo6sAdapter)
    {
        this.Iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    };

    @Override
    public void carregar() {
        Iphone4sTo6sAdapter.carregar();

    }
}