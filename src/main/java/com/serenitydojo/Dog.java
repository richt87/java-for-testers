package com.serenitydojo;

public class Dog extends Pet{
    private String favoriteGame;
    private int age;
    public static final String DOG_NOISE = "Woof!";


    public Dog(String name, String favoriteGame, int age){
        super(name,age);
        this.favoriteGame = favoriteGame;

    }
     public String getFavoriteToy() {
    return favoriteGame;
    }
    public int getAge() {return age;
    }
    public String makeNoise(){
        return DOG_NOISE;
    }
}

