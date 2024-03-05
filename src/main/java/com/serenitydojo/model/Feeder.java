package com.serenitydojo.model;

public class Feeder {
    public FoodTypes feeds(String animal, boolean isPremium) {
//        if (animal.equals("Cat")) {
////            if (isPremium) {
////                return "Salmon";
////            } else {
////                return "Tuna";
////            }
//            return (isPremium) ? "Salmon" : "Tuna";
//    }   else if (animal.equals("Dog")) {
////                if (isPremium) {
////                return "Delux dog food";
////            } else{
////                return "Dog food";
////                }
//            return  (isPremium) ? "Delux dog food" : "Dog food";
//    }   else if (animal.equals("Hamster")) {
////                if (isPremium) {
////                return "Lettuce";
////            } else{
////                return "Cabbage";
////                }
//            return  (isPremium) ? "Lettuce" : "Cabbage";
//            }
//        return "unknown;";

        switch (animal) {
            case "Cat":
                return (isPremium) ? FoodTypes.SALMON : FoodTypes.TUNA;
            case "Dog":
                return (isPremium) ? FoodTypes.DELUXE_DOG_FOOD : FoodTypes.DOG_FOOD;
            case "Hamster":
                return (isPremium) ? FoodTypes.LETTUCE : FoodTypes.CABBAGE;
            default:
                return FoodTypes.UNKNOWN;

        }

    }
}
