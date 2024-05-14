package org.example.estrutural;

public class Iphone4To6Adapter implements IphoneCarregador{

    Iphone4Carregador iphone4Carregador;
  public Iphone4To6Adapter()
    {
        iphone4Carregador = new Iphone4Carregador();
    }
    @Override
    public void carregar() {

      iphone4Carregador.carregando();
    }
}
