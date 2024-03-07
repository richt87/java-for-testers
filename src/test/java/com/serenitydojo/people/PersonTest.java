package com.serenitydojo.people;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    Person sam = new Person("Sam", Person.Gender.FEMALE, 30, "Green");
    Person bill = new Person("Bill", Person.Gender.MALE,45,"Blue");
    Person tim = new Person("Tim", Person.Gender.MALE,10,"Red");
    Person susan = new Person("Susan", Person.Gender.FEMALE,50,"Red");
    Person steve = new Person("Steve", Person.Gender.MALE,34,"Orange");
    Person ben = new Person("Ben", Person.Gender.MALE,28,"Red");
    List<Person> allThePeople = Arrays.asList(sam, bill, tim, susan, steve, ben);

    Predicate<Person> LIKE_BLUE = person -> person.getFavoriteColor().equals("Blue");
    Predicate<Person> LIKE_GREEN = person -> person.getFavoriteColor().equals("Green");
    Predicate<Person> LIKE_YELLOW = person -> person.getFavoriteColor().equals("Yellow");
    Predicate<Person> LIKE_RED = person -> person.getFavoriteColor().equals("Red");
    // Predicate<Person> BETWEEN_20_AND_40 = person -> person.getAge().equals("Red");
    Predicate<Person> UNDER_35 = person -> person.getAge() < 35;
    Predicate<Person> LIKE_RED_OR_UNDER_30
            = person -> person.getFavoriteColor().equals("Red") || person.getAge() <=30;


    @Test
    public void ICanSearchForPeopleByAge() {
        // search for people under 35

        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleUnder35 = people.findPeopleUnder35();

        System.out.println(people.findPeopleUnder35());
        assertThat(peopleUnder35).contains(sam, tim);
    }

//    @Test
//    public void ICanSearchForPeopleBetween20And40(){
//        PeopleDatabase people = new PeopleDatabase(allThePeople);
//        Predicate<Person> BETWEEN_20_AND_40
//                = person -> person.getAge();
//    }

    @Test
    public  void ICanSearchForPeopleWhoLikeRed() {

        PeopleDatabase people = new PeopleDatabase(allThePeople);
        List<Person> peopleWhoLikeRed = people.findAllThePeopleWho(LIKE_RED);

        assertThat(peopleWhoLikeRed).contains(susan);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeGreen() {
        PeopleDatabase people = new PeopleDatabase(allThePeople);

        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_GREEN);

        assertThat(matchingPeople).contains(sam);

    }

    @Test
    public void ICanSearchForPeopleWhoLikeBlue() {
        PeopleDatabase people = new PeopleDatabase(allThePeople);

//        PersonChecker LIKE_BLUE = new PersonChecker(){
//            @Override
//            public boolean test(Person person) {
//                    return person.getFavoriteColor().equals("Blue");
//                }
//        };
        List<Person> matchingPeople = people.findAllThePeopleWho(LIKE_BLUE);

        assertThat(matchingPeople).contains(sam);

    }

    @Test
    public void ICanSearchForPeopleWhoLikeRedOrWhoAreUnder30() {
        PeopleDatabase peopleDatabase = new PeopleDatabase(allThePeople);
            List<Person> matchingPeople
                    = peopleDatabase.findAllThePeopleWho(LIKE_RED_OR_UNDER_30);
    }

    @Test
    public void ICanSearchForPeopleWhoAreUnder35() {
        PeopleDatabase people = new PeopleDatabase(allThePeople);
            List<Person> peopleUnder35 = people.findAllThePeopleWho(UNDER_35);
        System.out.println(peopleUnder35);
        assertThat(peopleUnder35).contains(sam,tim);
    }

    @Test
    public void peopleCanEarnPoints() {
        List<String> allTheColors = allThePeople.stream()
                .map(person -> person.getName() + "'s favorite color is " + person.getFavoriteColor())
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(allTheColors);
    }

}