package com.rezha.project1;

import java.util.ArrayList;

/**
 * Created by Lenovo on 7/2/2015.
 */
public class Liga {

    private String namaLiga;
    private Klub daftarKlub;
    private Divisi divisi;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Divisi> namaDivisi = new ArrayList<Divisi>();



    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(String namaLiga, Klub daftarKlub) {
        this.namaLiga = namaLiga;
        this.daftarKlub = daftarKlub;
    }

    public String getNamaLiga() {
        System.out.println("Nama Liga");
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        System.out.println("Daftar Divisi");
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public ArrayList<Divisi> getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(Divisi divisi) {
        this.namaDivisi.add(divisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                ", daftarKlub=" + daftarKlub +
                '}';
    }
}
