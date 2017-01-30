package com.example.jonay.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista extends Activity implements I_Vista{

    private TextView display;
    private Button botonAdd;
    private Button botonSub;
    private I_Presentador miPresentador;


    class ButtonAdd implements View.OnClickListener {
        @Override
        public void onClick(View view){
            miPresentador.aumentar();
            miPresentador.actulizarBoton();
        }
    }

    class ButtonSub implements View.OnClickListener {
        @Override
        public void onClick(View view){
            miPresentador.disminuir();
            miPresentador.actulizarBoton();
        }
    }
    @Override
    public void actualizarBoton(Integer contador){
        display.setText(contador.toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miPresentador = new Presentador();
        miPresentador.setMiVista(this);

        botonAdd =(Button)findViewById(R.id.button1);
        botonSub =(Button)findViewById(R.id.button2);
        display=(TextView)findViewById(R.id.textView);

        botonAdd.setOnClickListener(new ButtonAdd());
        botonSub.setOnClickListener(new ButtonSub());
        miPresentador.actulizarBoton();
    }

}
