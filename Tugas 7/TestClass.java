package com.rezha.project1;

/**
 * Created by Lenovo on 6/10/2015.
 */
public class TestClass {

    public static void main(String[] args) {

        Penulis apip = new Penulis("Jalan Pongkoran",'L',"Apip","Kawin",99);
        Penulis ardy = new Penulis("Jalan pj",'L',"Ardy","Perjaka",18);

        Buku kambingJantan = new Buku("Aku Cemburu",46000.0,"Sinar Dunia",apip);
        System.out.println(kambingJantan.toString());
    }
}
