package com.rezha.project1;

import java.util.ArrayList;

/**
 * Created by Lenovo on 7/2/2015.
 */
public class Divisi {

    private String namaDivisi;
    private Liga liga;

    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();
    ArrayList<Klub> namaKlub = new ArrayList<Klub>();

    public ArrayList<Divisi> getDivisi(){
        return getDivisi();
    }

    public ArrayList<Klub> getDaftarKlub(Divisi Divisi){
        System.out.println("Daftar Klub :");
        return Divisi.daftarKlub();
    }

    private ArrayList<Klub> daftarKlub() {
        return daftarKlub;
    }

    public Divisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public ArrayList<Klub> getDaftarKlub() {
        System.out.println("Daftar Klub: ");
        return daftarKlub;
    }



    public ArrayList<Klub> getNamaKlub() {
        return namaKlub;
    }

    public void setNamaKlub(Klub klub) {
        this.namaKlub.add(klub);
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                ", namaDivisi='" + namaDivisi + '\'' +
                '}';
    }
}
