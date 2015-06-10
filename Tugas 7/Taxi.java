package com.rezha.project1;

/**
 * Created by Lenovo on 6/10/2015.
 */
public class Taxi {
    private String merkTaxi;
    private String jenisTaxi;
    private int tahunTaxi;
    private String grupTaxi;
    private Supir data;

    public Taxi() {
    }

    public Taxi(String merkTaxi, String jenisTaxi, int tahunTaxi) {
        this.merkTaxi = merkTaxi;
        this.jenisTaxi = jenisTaxi;
        this.tahunTaxi = tahunTaxi;
    }

    public Taxi(String merkTaxi, String jenisTaxi, int tahunTaxi, String grupTaxi, Supir data) {
        this.merkTaxi = merkTaxi;
        this.jenisTaxi = jenisTaxi;
        this.tahunTaxi = tahunTaxi;
        this.grupTaxi = grupTaxi;
        this.data = data;
    }

    public String getMerkTaxi() {
        return merkTaxi;
    }

    public void setMerkTaxi(String merkTaxi) {
        this.merkTaxi = merkTaxi;
    }

    public String getJenisTaxi() {
        return jenisTaxi;
    }

    public void setJenisTaxi(String jenisTaxi) {
        this.jenisTaxi = jenisTaxi;
    }

    public int getTahunTaxi() {
        return tahunTaxi;
    }

    public void setTahunTaxi(int tahunTaxi) {
        this.tahunTaxi = tahunTaxi;
    }

    public String getGrupTaxi() {
        return grupTaxi;
    }

    public void setGrupTaxi(String grupTaxi) {
        this.grupTaxi = grupTaxi;
    }

    public Supir getData() {
        return data;
    }

    public void setData(Supir data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "merkTaxi='" + merkTaxi + '\'' +
                ", jenisTaxi='" + jenisTaxi + '\'' +
                ", tahunTaxi=" + tahunTaxi +
                ", grupTaxi='" + grupTaxi + '\'' +
                ", oleh=" + data +
                '}';
    }
}
