package com.rezha.project1;

/**
 * Created by Lenovo on 7/2/2015.
 */
public class TestMain {
    public static void main(String[] args) {
//      Membuat Objek
        Liga spanyol = new Liga("Espanyol");

        Divisi bbva = new Divisi("BBVA");
        Divisi adelante = new Divisi("Adelante");

        Klub realMadrid = new Klub("Real Madrid",bbva,spanyol);
        Klub barcelona = new Klub("Barcelona",bbva,spanyol);

        Klub barcelonaB = new Klub("Barcelona B",adelante,spanyol);
        Klub atletico = new Klub("Atletico Madrid",adelante,spanyol);


        spanyol.setDaftarDivisi(bbva);
        spanyol.setDaftarDivisi(adelante);


        bbva.setDaftarKlub(realMadrid);
        bbva.setDaftarKlub(barcelona);

        adelante.setDaftarKlub(barcelonaB);
        adelante.setDaftarKlub(atletico);

        spanyol.setNamaDivisi(bbva);

        System.out.println("Tugas Besar PBO");
        System.out.println("_______________");
        System.out.println("");


//        No 1(Get daftar Divisi by nama Liga)
        System.out.println("Nomer 1");
        System.out.println(spanyol.getNamaLiga());
        System.out.println(spanyol.getNamaDivisi());
        System.out.println("");

//        No 2(Get daftar Klub by nama Liga)
        System.out.println("Nomer 2");
        spanyol.setDaftarKlub(realMadrid);
        System.out.println(spanyol.getNamaLiga());
        System.out.println(spanyol.getDaftarKlub());
        System.out.println("");

//        No 3(Get daftar Klub by nama Divisi)
        System.out.println("Nomer 3");
        System.out.println(bbva.getNamaDivisi());
        System.out.println(bbva.getDaftarKlub());
        System.out.println(adelante.getNamaDivisi());
        System.out.println(adelante.getDaftarKlub());
        System.out.println("");


//        No 4(Get Klub ini berada di Divisi mana by nama Klub)
        System.out.println("Nomer 4");
        barcelonaB.getNamaKlub();
        System.out.println(barcelonaB.getNamaKlub());
        System.out.println(barcelonaB.getDivisi());
        System.out.println("");

//        No 5(Get Klub ini berada di Liga apa by nama Klub)
        System.out.println("Nomer 5");
        realMadrid.getNamaKlub();
        System.out.println(realMadrid.getNamaKlub());
        System.out.println(realMadrid.getLiga());
        System.out.println("");

    }
}
