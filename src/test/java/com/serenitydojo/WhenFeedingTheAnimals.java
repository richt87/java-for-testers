package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodTypes;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Cat", false);
        System.out.println(food);

        Assert.assertEquals(FoodTypes.TUNA, food);
    }
    @Test
    public void shouldFeedHamstersCabbage(){
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Hamster", false);
        System.out.println(food);

        Assert.assertEquals(FoodTypes.CABBAGE, food);
    }
    @Test
    public void shouldFeedDogsDoogFood(){
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Dog", false);
        System.out.println(food);

        Assert.assertEquals(FoodTypes.DOG_FOOD, food);
    }
    @Test
    public void shouldFeedPremiumCatsPremiumCatFood(){
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Cat", true);
        System.out.println(food);

        Assert.assertEquals(food,FoodTypes.SALMON);


    }
    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Dog", true);
        System.out.println(food);

        Assert.assertEquals(FoodTypes.DELUXE_DOG_FOOD, food);
    }
    @Test
    public void shouldFeedPremiumHampstersLettuce() {
        Feeder feeder = new Feeder();

        FoodTypes food = feeder.feeds("Hamster", true);
        System.out.println("This premium hamster eats " + food);

        Assert.assertEquals(food,FoodTypes.LETTUCE);
    }
}
