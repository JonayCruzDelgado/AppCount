package com.example.jonay.appcount;

/**
 * Created by Jcruz on 28/01/2017.
 */

public class Modelo implements I_Modelo{
   private Integer contador;

    public Modelo() {
        super();
        this.contador = 0;
    }

    @Override
   public void aumentarContador(){
        contador ++;
    }
    @Override
   public void disminuirContador(){
        contador --;
    }
    @Override
    public Integer getContador() {
        return contador;
    }
}

