package com.rezha.project1;

public class Penulis {

    private String namaPenulis;
    private String alamatPenulis;
    private char jenisKelamin;
    private String statusPenulis;
    private int umurPenulis;

    public Penulis(String alamatPenulis, char jenisKelamin, String namaPenulis) {
        this.alamatPenulis = alamatPenulis;
        this.jenisKelamin = jenisKelamin;
        this.namaPenulis = namaPenulis;
    }

    public Penulis(String alamatPenulis, char jenisKelamin, String namaPenulis, String statusPenulis, int umurPenulis) {
        this.alamatPenulis = alamatPenulis;
        this.jenisKelamin = jenisKelamin;
        this.namaPenulis = namaPenulis;
        this.statusPenulis = statusPenulis;
        this.umurPenulis = umurPenulis;
    }

    public String getAlamatPenulis() {
        return alamatPenulis;
    }

    public void setAlamatPenulis(String alamatPenulis) {
        this.alamatPenulis = alamatPenulis;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getStatusPenulis() {
        return statusPenulis;
    }

    public void setStatusPenulis(String statusPenulis) {
        this.statusPenulis = statusPenulis;
    }

    public int getUmurPenulis() {
        return umurPenulis;
    }

    public void setUmurPenulis(int umurPenulis) {
        this.umurPenulis = umurPenulis;
    }

    @Override
    public String toString() {
        return "Data Penulis sebagai berikut{" +
                "alamatPenulis='" + alamatPenulis + '\'' +
                ", namaPenulis='" + namaPenulis + '\'' +
                ", jenisKelamin=" + jenisKelamin +
                ", statusPenulis='" + statusPenulis + '\'' +
                ", umurPenulis=" + umurPenulis +
                '}';
    }
}


