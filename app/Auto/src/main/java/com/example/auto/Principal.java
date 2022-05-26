package com.example.auto;

public class Principal {
    public static void main(String[] args) {
        Auto Au1= new Auto("Volkswagen", "Vento", 2015);
        Auto Au2 = new Auto("Volkswagen", "Golf", 2020);
        Auto Au3 = new Auto("Chevrolet", "Cruze", 2018);
        Auto Au4 = new Auto("Chevrolet", "Bio", 2019);
        // System.out.println(Au.toString());
        Auto[] lote = new Auto[4];
        lote[0] = Au1;
        lote[1] = Au2;
        lote[2] = Au3;
        lote[3] = Au4;
        System.out.println("Mi lote de autos tiene el siguiente inventario: ");
        for (Auto a:lote){
            System.out.println("------------------");
            System.out.println(a.toString());
    }
}
