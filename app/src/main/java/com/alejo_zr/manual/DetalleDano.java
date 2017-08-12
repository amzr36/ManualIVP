package com.alejo_zr.manual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleDano extends AppCompatActivity {

    private ImageView imgFoto;
    private TextView tvDaño, tvdñ, tvExplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_dano);

        Bundle parametros = getIntent().getExtras();
        //ImageView imgFoto = parametros.ge
        String daño = parametros.getString("daño");
        String dñ = parametros.getString("dñ");

        tvDaño = (TextView) findViewById(R.id.tvDaño);
        tvdñ = (TextView) findViewById(R.id.tvdñ);

        tvDaño.setText(daño);
        tvdñ.setText(dñ);
    }
}
