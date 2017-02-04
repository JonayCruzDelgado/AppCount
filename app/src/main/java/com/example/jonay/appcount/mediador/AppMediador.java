package com.example.jonay.appcount.mediador;

import android.app.Application;

import com.example.jonay.appcount.pantallaInicial.I_Modelo;
import com.example.jonay.appcount.pantallaInicial.I_Presentador;
import com.example.jonay.appcount.pantallaInicial.I_Vista;
import com.example.jonay.appcount.pantallaInicial.Presentador;

/**
 * Created by Jcruz on 04/02/2017.
 */

public class AppMediador extends Application {
    private static AppMediador singleton;
    private I_Modelo modelo;
    private I_Presentador presentador;
    private I_Vista vista;
    public static AppMediador getInstance(){
        return singleton;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
        presentador = null;
    }

    public I_Presentador getPresentador() {
        if (presentador == null) {
            presentador = new Presentador();
        }
        return presentador;
    }


    public I_Vista getVista() {
        return vista;
    }

    public void setVista(I_Vista vista) {
        this.vista = vista;
    }

    public I_Modelo getModelo() {
        return modelo;
    }

    public void setModelo(I_Modelo miModelo) {
        this.modelo = modelo;
    }
}
