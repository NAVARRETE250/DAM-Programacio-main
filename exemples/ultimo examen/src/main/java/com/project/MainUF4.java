package com.project;

public class MainUF4 {
    public static void main(String[] args) {
        CentreComercial centreComercial = new CentreComercial();

        centreComercial.afegirBotiga(new BotigaRoba("Zara", "Planta 1", "Moda"));
        centreComercial.afegirBotiga(new BotigaMenjar("McBurger", "Planta 2", "Fast Food"));
        centreComercial.afegirBotiga(new BotigaRoba("H&M", "Planta 1", "Moda"));
        centreComercial.afegirBotiga(new BotigaElectronica("MediaMarkt", "Planta 2", "Electrònica"));
        centreComercial.afegirBotiga(new BotigaElectronica("Fnac", "Planta 3", "Electrònica"));

        System.out.println("Totes les botigues:");
        for (Botiga botiga : centreComercial.getBotigues()) {
            System.out.println(botiga);
        }

        System.out.println("\nBotigues de Roba:");
        for (BotigaRoba botigaRoba : centreComercial.getBotiguesRoba()) {
            System.out.println(botigaRoba);
        }

        System.out.println("\nBotigues de Menjar:");
        for (BotigaMenjar botigaMenjar : centreComercial.getBotiguesMenjar()) {
            System.out.println(botigaMenjar);
        }

        System.out.println("\nBotigues d'Electrònica:");
        for (BotigaElectronica botigaElectronica : centreComercial.getBotiguesElectronica()) {
            System.out.println(botigaElectronica);
        }

        System.out.println("\nBotigues a la Planta 2:");
        for (Botiga botiga : centreComercial.getBotiguesPerUbicacio("Planta 2")) {
            System.out.println(botiga);
        }

        BotigaRoba zara = (BotigaRoba) centreComercial.getBotigas().get(0);
        System.out.print("\nOriginal: " + zara.descripcioDetallada());
        zara.setTipusRoba("Alta Moda");
        System.out.println("\nModificat: " + zara.descripcioDetallada());

        BotigaMenjar mcdonalds = (BotigaMenjar) centreComercial.getBotigas().get(1);
        System.out.print("\nOriginal: " + mcdonalds.descripcioDetallada());
        mcdonalds.setTipusMenjar("Gourmet Fast Food");
        System.out.println("\nModificat: " + mcdonalds.descripcioDetallada());
    }
}

