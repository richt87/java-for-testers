package com.serenitydojo;

public class Cat {
    private String name;
    private String favoriteFood;
    private int age;

    public static String usualFood(){
        return "Biscuits";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.favoriteFood = Cat.usualFood();
    }
    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }
    static String CAT_NOISE = "Meow!";
    public String getName() {
        return name;
    }
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }
    public int getAge(){
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickpaws();
        cleanFur();
        System.out.println(name + " is clean!");
    }
    private void lickpaws() {
        System.out.println(name + " licks his paws");
    }
    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }
}
