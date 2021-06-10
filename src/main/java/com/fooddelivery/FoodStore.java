package com.fooddelivery;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStore {
    public ArrayList<FoodItem> foodStore = new ArrayList<>();

    public void prepare(FoodItem foodItem) {
        foodStore.add(foodItem);
    }

    public void deliver(FoodItem foodItem) {
        foodStore.remove(foodItem);
    }

    public void printFood() {
        for (FoodItem foodItem : foodStore) {
            System.out.println(foodItem);
        }
    }

    private void printStarterItems() {
        for (FoodItem foodItem : foodStore) {
            if (foodItem.getFoodCategories() == (FoodCategories.STARTER)) {
                System.out.println(foodItem);
            }
        }
    }
    public void printMainCourseItems() {
        for (FoodItem foodItem : foodStore){
            if (foodItem.getFoodCategories() == (FoodCategories.MAIN_COURSE)) {
                System.out.println(foodItem);
            }

        }
    }
    public void createSystemMenu() {
        System.out.println("1. Print Starters \n " +
                "2. Print Main Course \n " +
                "3. Prepare Food \n " +
                "4. Deliver Food");
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printStarterItems();
                break;
            case 2:
                printMainCourseItems();
        }

    }
}
