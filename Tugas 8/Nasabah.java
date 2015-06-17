package com.rezha.project1;

/**
 * Created by Lenovo on 6/17/2015.
 */
public class Nasabah {
    private String nama;
    private Rekening saldo;

    public Nasabah() {
    }

    public Nasabah(String nama, Rekening saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Rekening getSaldo() {
        return saldo;
    }

    public void setSaldo(Rekening saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nama='" + nama + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
