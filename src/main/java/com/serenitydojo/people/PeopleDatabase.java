package com.serenitydojo.people;

import java.util.ArrayList;
import java.util.List;

public class PeopleDatabase {
    List<Person> allThePeople;

    public PeopleDatabase(List<Person> allThePeople) {
        this.allThePeople = allThePeople;
        }


    public List<Person> findPeopleUnder35() {
        List<Person> peopleUnder35 = new ArrayList<>();
            for (Person person : allThePeople){
                if (person.getAge() < 35) {
                    peopleUnder35.add(person);
                }
        }
        return peopleUnder35;

    }

    public List<Person> peopleWhoLikeRed() {
        List<Person> whoLikesRed = new ArrayList<>();
            for (Person person : allThePeople){
                if (person.getFavoriteColor() == "Red") {
                    whoLikesRed.add(person);
                }
            }
            return whoLikesRed;
    }
}
