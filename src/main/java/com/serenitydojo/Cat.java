package com.serenitydojo;

public class Cat extends Pet {
    private String favoriteFood;
    private int age;
    public static final String CAT_NOISE = "Meow!";

    public static String usualFood(){
        return "Biscuits";
    }

    public Cat(String name, int age){
        super(name, age);
        this.favoriteFood = Cat.usualFood();
    }
    public Cat(String name, String favoriteFood, int age) {
        super(name, age);
        this.favoriteFood = favoriteFood;
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

    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickpaws();
        cleanFur();
        System.out.println(getName() + " is clean!");
    }
    private void lickpaws() {
        System.out.println(getName() + " licks his paws");
    }
    private void cleanFur() {
        System.out.println(getName() + " cleans his fur");
    }
}
