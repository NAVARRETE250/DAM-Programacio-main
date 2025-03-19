package com.project;


import java.util.ArrayList;
import java.util.List;

class CentreComercial {
    protected List<Botiga> botigas;

public CentreComercial(){
    this.botigas = new ArrayList<>();
}
public void afegirBotiga(Botiga botiga){
    botigas.add(botiga);
    // return botiguesRoba;
}


     public List<BotigaMenjar> getBotiguesMenjar() {
        List<BotigaMenjar> botiguesMenjar = new ArrayList<>();
        for (Botiga botiga : botigues) {
            if (botiga instanceof BotigaMenjar) {
                botiguesMenjar.add((BotigaMenjar) botiga);
            }
        }
        return botiguesMenjar;
    }

       public List<BotigaElectronica> getBotiguesElectronica() {
        List<BotigaElectronica> botiguesElectronica = new ArrayList<>();
        for (Botiga botiga : botigues) {
            if (botiga instanceof BotigaElectronica) {
                botiguesElectronica.add((BotigaElectronica) botiga);
            }
        }
        return botiguesElectronica;
    }

     public List<Botiga> getBotiguesPerUbicacio(String ubicacio) {
        List<Botiga> botiguesPerUbicacio = new ArrayList<>();
        for (Botiga botiga : botigues) {
            if (botiga.getUbicacio().equalsIgnoreCase(ubicacio)) {
                botiguesPerUbicacio.add(botiga);
            }
        }
        return botiguesPerUbicacio;
    }


}
    
