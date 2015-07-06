package com.rezha.project1;

/**
 * Created by Lenovo on 7/2/2015.
 */
public class TestMain {
    public static void main(String[] args) {
//      Membuat Objek
        Liga spanyol = new Liga("Espanyol");
        Liga inggris = new Liga("Inggris");

        Divisi bbva = new Divisi("BBVA");
        Divisi adelante = new Divisi("Adelante");

        Klub realMadrid = new Klub("Real Madrid",bbva,spanyol);
        Klub barcelona = new Klub("Barcelona",bbva,spanyol);

        Klub barcelonaB = new Klub("Barcelona B",adelante,inggris);
        Klub atletico = new Klub("Atletico Madrid",adelante,inggris);


        spanyol.setDaftarDivisi(bbva);
        inggris.setDaftarDivisi(adelante);

        bbva.setDaftarKlub(realMadrid);
        bbva.setDaftarKlub(barcelona);

        adelante.setDaftarKlub(barcelonaB);
        adelante.setDaftarKlub(atletico);

        System.out.println("Tugas Besar PBO");
        System.out.println("_______________");
        System.out.println("");



        System.out.println("");

//      dengan parameter: dari liga memanggil semua klub dari liga
        System.out.println("Tambahan :");
        System.out.println("Menggunakan Parameter..");
        System.out.println(bbva.getDaftarKlub(bbva));

        System.out.println("");

//        No 1(Get daftar Divisi by nama Liga)
        System.out.println("Nomer 1");
        System.out.println(spanyol.getDaftarDivisi());
        System.out.println("");

//        No 2(Get daftar Klub by nama Liga)
        System.out.println("Nomer 2");
        spanyol.setDaftarKlub(realMadrid);
        System.out.println(spanyol.getDaftarKlub());
        System.out.println("");

//        No 3(Get daftar Klub by nama Divisi)
        System.out.println("Nomer 3");
        System.out.println(bbva.getDaftarKlub());
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
