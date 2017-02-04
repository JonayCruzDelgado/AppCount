package com.example.jonay.appcount.pantallaInicial;

import com.example.jonay.appcount.mediador.AppMediador;

/**
 * Created by Jcruz on 28/01/2017.
 */

public class Presentador implements I_Presentador {
    private I_Modelo miModelo;
    private I_Vista miVista;



    public Presentador(){
        super();
        this.miModelo = new Modelo();
        miVista = AppMediador.getInstance().getVista();
        AppMediador.getInstance().setModelo(miModelo);
    }

    @Override
    public void aumentar(){
        miModelo.aumentarContador();
    }
    @Override
    public void disminuir(){
        miModelo.disminuirContador();
    }
    @Override
    public void actulizarBoton(){
        Integer variable = miModelo.getContador();
        miVista.actualizarBoton(variable);

    }
}
