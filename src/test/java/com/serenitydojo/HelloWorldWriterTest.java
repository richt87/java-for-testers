package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){

        int ageThisYear = 42;

        int ageNextYear = ageThisYear +1;

        System.out.println("age = " + ageNextYear);

    }

    @Test
    public void workingWithStrings() {

        String firstName = "    Richard    ";

        String upperCaseFirstName = firstName.toUpperCase();

        String lowerCaseFirstName = firstName.toLowerCase();

        String replaceFirstName = firstName.replace("Richard","Richie-boy");

        System.out.println(firstName.trim());

    }

}
