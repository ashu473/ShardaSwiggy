package org.example;

public class Dish {
    private String restroId;
    String dishName;
    int dishId;
    int dishPrice;

    public Dish(int dishId, String dishName,int dishPrice){
        this.dishId=dishId;
        this.dishPrice=dishPrice;
        this.dishName=dishName;


    }

    @Override
    public String toString() {
        return "dish{"+"Dishname="+dishName+"DishId"+dishId+"DishPrice"+dishPrice;
    }
}
