package com.rezha.project1;

/**
 * Created by Lenovo on 6/10/2015.
 */
public class TestProject {

    public static void main(String[] args) {

        Supir ardy = new Supir("Ardy Indracahya",19,'L',"Jalan Permata Jingga",2004);

        Taxi pertama = new Taxi("Alphard","VIP",2014,"Blue Bird",ardy);
        System.out.println(pertama.toString());
    }
}
