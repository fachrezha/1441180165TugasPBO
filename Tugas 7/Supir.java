package com.rezha.project1;

/**
 * Created by Lenovo on 6/10/2015.
 */
public class Supir {
    private String namaSupir;
    private int umurSupir;
    private char jenisKelamin;
    private String alamatSupir;
    private int tahunBekerja;

    public Supir(String namaSupir, int umurSupir, char jenisKelamin) {
        this.namaSupir = namaSupir;
        this.umurSupir = umurSupir;
        this.jenisKelamin = jenisKelamin;
    }

    public Supir(String namaSupir, int umurSupir, char jenisKelamin, String alamatSupir, int tahunBekerja) {
        this.namaSupir = namaSupir;
        this.umurSupir = umurSupir;
        this.jenisKelamin = jenisKelamin;
        this.alamatSupir = alamatSupir;
        this.tahunBekerja = tahunBekerja;
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    public void setNamaSupir(String namaSupir) {
        this.namaSupir = namaSupir;
    }

    public int getUmurSupir() {
        return umurSupir;
    }

    public void setUmurSupir(int umurSupir) {
        this.umurSupir = umurSupir;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamatSupir() {
        return alamatSupir;
    }

    public void setAlamatSupir(String alamatSupir) {
        this.alamatSupir = alamatSupir;
    }

    public int getTahunBekerja() {
        return tahunBekerja;
    }

    public void setTahunBekerja(int tahunBekerja) {
        this.tahunBekerja = tahunBekerja;
    }

    @Override
    public String toString() {
        return "Supir :{" +
                "namaSupir='" + namaSupir + '\'' +
                ", umurSupir=" + umurSupir +
                ", jenisKelamin=" + jenisKelamin +
                ", alamatSupir='" + alamatSupir + '\'' +
                ", tahunBekerja=" + tahunBekerja +
                '}';
    }
}

