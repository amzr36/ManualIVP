package com.alejo_zr.manual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class PavimentoRigido extends AppCompatActivity {

    ArrayList<Daño> daños;
    private RecyclerView listaDaños;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavimento_flexible);

        listaDaños = (RecyclerView) findViewById(R.id.rvDaño);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaDaños.setLayoutManager(llm);
        inicializarListaDañoFlex();
        inicializarAdaptador();
    }

    public DañoAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new DañoAdaptador(daños, this);
        listaDaños.setAdapter(adaptador);
    }


    public void inicializarListaDañoFlex(){

        daños = new ArrayList<Daño>();

        daños.add(new Daño(R.drawable.grieta_esquina, getString(R.string.grieta_esquina), getString(R.string.g_e), R.raw.GE));
        daños.add(new Daño(R.drawable.grieta_longitudinal,getString(R.string.grieta_longitudinal), getString(R.string.g_l),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.grieta_transversal), getString(R.string.g_t),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.grieta_pasadores), getString(R.string.g_p),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.grietas_bloque), getString(R.string.g_b),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.grietas_pozos), getString(R.string.g_a),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.separacion_juntas), getString(R.string.s_j),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.deterioro_sello), getString(R.string.dst_dsl),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.desportillamiento_juntas), getString(R.string.dpt_dpl),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.descascaramiento), getString(R.string.de),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.desintegracion), getString(R.string.di),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.baches), getString(R.string.bch),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.pulimiento), getString(R.string.pu),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.escalonamiento_juntas), getString(R.string.ejl_ejt),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.levantamiento_localizado), getString(R.string.let_lel),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.parches), getString(R.string.pcha),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.hundimientos), getString(R.string.hu),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.fisuracion_retraccion), getString(R.string.fr),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.fisuras_ligeras), getString(R.string.ft),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.fisuracion_durabilidad), getString(R.string.fd),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.bombeo_juntas), getString(R.string.bot_bol),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.ondulaciones), getString(R.string.on),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.descenso_berma), getString(R.string.db),R.raw.GE));
        daños.add(new Daño(R.drawable.mario,getString(R.string.separacion_berma_pavimento), getString(R.string.sb),R.raw.GE));
    }




}

