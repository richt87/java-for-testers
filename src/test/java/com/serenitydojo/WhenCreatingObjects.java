package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;
import org.w3c.dom.ls.LSOutput;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
//        String name = "Felix";
//        String favoriteFood = "Tuna";
//        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        Cat Samson = new Cat("Samson", "Kibble", 6);

        System.out.println(Samson.getName());
        System.out.println(Samson.getFavoriteFood());
        System.out.println(Samson.getAge());
    }
    @Test
    public void cat_makes_a_noise(){
        Cat Felix = new Cat("Felix", 4);
        Cat Samson = new Cat("Samson", "Chicken and gravy", 6);

        System.out.println("Felix goes " + Felix.makeNoise());
        System.out.println("Samson goes " + Samson.makeNoise());
//        System.out.println("Samson's favorite food is " + Samson.getFavoriteFood());
//        Felix.makeNoise();
//        Felix.feed("Tuna");
//        Felix.groom();
//        Samson.makeNoise();
//        Samson.feed("Kibble");
//        Samson.groom();

    }
    @Test
    public void creating_a_hampster(){
//        String name = "Rusty";
//        String favoriteGame = "wheel running";
//        int age = 1;

        Hampster Rusty = new Hampster("Rusty", "wheel running", 1);

        System.out.println(Rusty.getName());
        System.out.println(Rusty.getFavoriteGame());
        System.out.println(Rusty.getAge());

        Assert.assertEquals(Rusty.getName(),"Rusty");
        Assert.assertEquals(Rusty.getAge(),1);
        Assert.assertEquals(Rusty.getFavoriteGame(),"wheel running");



    }
    @Test
    public void creating_a_dog(){

        Dog fido = new Dog("Fido", "Bone", 3);

        System.out.println(fido.getName());
        System.out.println(fido.getFavoriteToy());
        System.out.println(fido.getAge());

        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getAge(),3);
        Assert.assertEquals(fido.getFavoriteToy(),"Bone");

    }
    @Test
    public void dog_makes_a_noise(){
        Dog fido = new Dog("Fido", "Catch", 3);

        System.out.println("Fido goes " + fido.makeNoise());
    }
    @Test
    public void pets_make_a_noise(){
        Pet fido = new Dog("Fido", "Catch", 3);
        Pet felix = new Cat("Felix",3);
        Pet rusty = new Hampster("Rusty", "Wheel", 1);

        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
    }

}