package com.example.jonay.appcount;

/**
 * Created by Jcruz on 28/01/2017.
 */

public class Presentador implements I_Presentador{
    private I_Modelo miModelo;
    private I_Vista miVista;



    public Presentador(){
        super();
        this.miModelo = new Modelo();
    }
    @Override
    public I_Vista getMiVista() {
        return miVista;
    }
    @Override
    public void setMiVista(Vista miVista) {
        this.miVista = miVista;
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
