package com.fooddelivery;

public class ChickenCurry extends FoodItem {
    public ChickenCurry(){
        this.setFoodName("ChickenCurry");
        this.setFoodType(FoodType.NON_VEG);
        this.setFoodCategories(FoodCategories.MAIN_COURSE);
    }
}
