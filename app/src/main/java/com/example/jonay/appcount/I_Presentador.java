package com.example.jonay.appcount;

/**
 * Created by Jcruz on 30/01/2017.
 */

public interface I_Presentador {
    I_Vista getMiVista();

    void setMiVista(Vista miVista);

    void aumentar();

    void disminuir();

    void actulizarBoton();
}
