package com.project;


public class BotigaElectronica extends Botiga{
    private String marcaPrincipal;


public BotigaElectronica (String nom, String ubicacio, String marcaPrincipal){
       super(nom, ubicacio);
       this.marcaPrincipal = marcaPrincipal;
   
   }


   public String getMarcaPrincipal() {
        return marcaPrincipal;
    }
    public void setMarcaPrincipal(String marcaPrincipal) {
        this.marcaPrincipal = marcaPrincipal;
    }
        public String descripcioDetallada() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException(" nom" + nom + ", BotigaElectronica [marcaPrincipal=" + marcaPrincipal + ", ubicacio"+ ubicacio + "]");
       }

   
}