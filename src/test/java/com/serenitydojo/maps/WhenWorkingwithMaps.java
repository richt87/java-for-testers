package com.serenitydojo.maps;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingwithMaps {

    @Test
    public void creatingAMap() {
        Map<String,Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("blue",5);
        numberOfBallsByColor.put("red",3);
        numberOfBallsByColor.put("green",6);

        Integer numberOfBallsByColour = numberOfBallsByColor.get("green");
        System.out.println("The number of green balls is " + numberOfBallsByColour);
    }

    @Test
    public void creatingAMapMoreConcisely() {
        Map<String,Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);
        Map<String,Integer> moreColors = new HashMap<>();
        moreColors.put("yellow",10);
        moreColors.put("mauve",0);
        moreColors.putAll(numberOfBallsByColor);


        moreColors.put("yellow",20);
        moreColors.replace("pink",20);
        System.out.println("number of pink tennis balls " + moreColors.getOrDefault("pink",0));
    }

    @Test
    public void iteratingOverMapKeys(){
        Map<String,Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);

        System.out.println("Keys =  " + numberOfBallsByColor.keySet());

        printMap(numberOfBallsByColor);
        Map<String,Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColor);
        modifiableMap.clear();

        printMap(modifiableMap);
    }

    private static void printMap(Map<String, Integer> numberOfBallsByColor) {
        for(Map.Entry<String,Integer> entry : numberOfBallsByColor.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
    }


}
