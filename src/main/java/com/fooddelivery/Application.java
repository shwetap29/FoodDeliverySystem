package com.fooddelivery;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        FoodStore foodStore = new FoodStore();

        System.out.println(" Welcome to Food Delivery System");
        ChickenCurry chickenCurry = new ChickenCurry();
        chickenCurry.setPrice(180);
        chickenCurry.setTaste(Taste.SPICY);

        PaneerMasala paneerMasala = new PaneerMasala();
        paneerMasala.setPrice(10);
        paneerMasala.setTaste(Taste.SALTY);

        DalFry dalFry = new DalFry();
        dalFry.setPrice(280);
        dalFry.setTaste(Taste.LESS_SPICY);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setPrice(20);
        masalaPapad.setTaste(Taste.SALTY);

        PotatoFry potatoFry = new PotatoFry();
        potatoFry.setPrice(40);
        potatoFry.setTaste(Taste.MEDIUM_SPICY);


        // adding the foods items
        foodStore.prepare(chickenCurry);
        foodStore.prepare(paneerMasala);
        foodStore.prepare(dalFry);
        foodStore.prepare(masalaPapad);
        foodStore.prepare(potatoFry);



//        //printing the food items
//        foodStore.printFood();
//
//        // delivering the food items
//        foodStore.deliver(chickenCurry);
//
//        System.out.println("Food Items after Delivery ------------------------------------------");
//
//        //printing food items after delivering
//        foodStore.printFood();
        foodStore.createSystemMenu();

    }
}


