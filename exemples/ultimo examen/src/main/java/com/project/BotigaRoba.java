package com.project;

public class BotigaRoba extends Botiga{
    private String tipusRoba;

public BotigaRoba(String nom, String ubicacio, String tipusRoba){
    super(nom, ubicacio);
    this.tipusRoba = tipusRoba;
    }
    

    public String getTipusRoba() {
        return tipusRoba;
    }
    public void setTipusRoba(String tipusRoba) {
        this.tipusRoba = tipusRoba;
    }


    public String descripcioDetallada() {
        // TODO Auto-generated method stub
        return "BotigaRoba{nom='" + nom + "', tipusRoba='" + tipusRoba + "', ubicacio='" + ubicacio + "'}";
    }   
}


 