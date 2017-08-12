package com.alejo_zr.manual;

/**
 * Created by Alejo on 12/08/2017.
 */

public class Daño {

    private int foto;
    private String daño;
    private String dñ;


    public Daño(int foto, String daño, String dñ){

        this.foto = foto;
        this.daño = daño;
        this.dñ   = dñ;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }

    public String getDñ() {
        return dñ;
    }

    public void setDñ(String dñ) {
        this.dñ = dñ;
    }
}
