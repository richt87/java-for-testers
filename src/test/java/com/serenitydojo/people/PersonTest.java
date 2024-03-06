package com.serenitydojo.people;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    Person sam = new Person("Sam", Person.Gender.FEMALE, 30, "Green");
    Person bill = new Person("Bill", Person.Gender.MALE,45,"Blue");
    Person tim = new Person("Tim", Person.Gender.MALE,10,"Red");
    Person susan = new Person("Susan", Person.Gender.FEMALE,50,"Red");
    List<Person> allThePeople = Arrays.asList(sam, bill, tim, susan);


    @Test
    public void ICanSearchForPeopleByAge() {
        // search for people under 35

        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleUnder35 = people.findPeopleUnder35();

        System.out.println(people.findPeopleUnder35());
        assertThat(peopleUnder35).contains(sam, tim);
    }

    @Test
    public  void ICanSearchForPeopleWhoLikeRed() {

        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> WhoLikesRed = people.peopleWhoLikeRed();

        System.out.println(people.peopleWhoLikeRed());
        assertThat(WhoLikesRed).contains(tim, susan);
    }
}
