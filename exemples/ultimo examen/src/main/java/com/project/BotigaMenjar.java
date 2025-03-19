package com.project;

public class BotigaMenjar extends Botiga{
    private  String tipusMenjar;

    public BotigaMenjar (String nom, String ubicacio, String tipusMenjar){
        super(nom, ubicacio);
        this.tipusMenjar = tipusMenjar;
    
    }


    public String getTipusMenjar() {
        return tipusMenjar;
    }

    public void setTipusMenjar(String tipusMenjar) {
        this.tipusMenjar = tipusMenjar;
    }

    public String descripcioDetallada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(" nom" + nom + ", BotigaMenjar [tipusMenjar=" + tipusMenjar + ", ubicacio"+ ubicacio + "]");
    }
    
}

