package com.project;


abstract class Botiga {
    protected String nom;
    protected String ubicacio;
    
    public Botiga(String nom, String ubicacio){
        this.nom = nom;
        this.ubicacio = ubicacio;
    }
    public abstract String descripcioDetallada();
    
    @Override
    public String toString() {
        return "Botiga{nom='" + nom + "', ubicacio='" + ubicacio + "'}";
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getUbicacio() {
        return ubicacio;
    }
    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }
  
    }
    