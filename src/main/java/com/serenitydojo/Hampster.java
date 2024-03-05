package com.serenitydojo;

public class Hampster extends Pet {
    private String favoriteGame;
    private int age;

    public Hampster(String name, String favoriteGame, int age){
        super(name, age);
        this.favoriteGame = favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame){
        this.favoriteGame = favoriteGame;
    }
    public String getFavoriteGame(){
        return favoriteGame;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise(){
        return "Squeek!";
    }
}
