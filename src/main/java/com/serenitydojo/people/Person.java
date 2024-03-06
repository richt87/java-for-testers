package com.serenitydojo.people;

public class Person {
    public enum Gender { MALE,  FEMALE }

    String name;
    Gender gender;
    int age;
    String favoriteColor;


    public Person(String name, Gender gender, int age, String favoriteColor) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.favoriteColor = favoriteColor;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }
    @Override
    public String toString(){
        return name;
    }
}
