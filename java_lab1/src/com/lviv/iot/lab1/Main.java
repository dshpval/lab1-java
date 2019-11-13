package com.lviv.iot.lab1;

public class Main {

    public static void main(String[] args) {
        PromoItem PromoItem1 = new PromoItem();
        PromoItem PromoItem2 = new PromoItem("Eldorado", 18500, 15000, "Notebook Lenovo");
        PromoItem PromoItem3 = new PromoItem("Auchan", 17000,
                14000, "Microwave SAMSUNG",
                "SG-540", "Microwave", "electronics");

        PromoItem.getNumberOfPromoItems();
        PromoItem.printStaticField();
        PromoItem1.printField();

        System.out.println(PromoItem1.toString());
        System.out.println(PromoItem2.toString());
        System.out.println(PromoItem3.toString());
    }
}