package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;
import org.w3c.dom.ls.LSOutput;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        Cat Felix = new Cat("Felix", "Tuna", 4);

        System.out.println(Felix.getName());
        System.out.println(Felix.getFavoriteFood());
        System.out.println(Felix.getAge());

        Cat Samson = new Cat("Samson", "Kibble", 6);

        System.out.println(Samson.getName());
        System.out.println(Samson.getFavoriteFood());
        System.out.println(Samson.getAge());

    }

    @Test
    public void cat_makes_a_noise(){
        Cat Felix = new Cat("Felix", 4);
        Cat Samson = new Cat("Samson", "Chicken and gravy", 6);

        System.out.println("Felix' favorite food is " + usualFood());
        System.out.println("Samson's favorite food is " + Samson.getFavoriteFood());
//        Felix.makeNoise();
//        Felix.feed("Tuna");
//        Felix.groom();
//        Samson.makeNoise();
//        Samson.feed("Kibble");
//        Samson.groom();

    }


}
