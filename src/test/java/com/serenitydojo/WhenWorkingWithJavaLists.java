package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import org.assertj.core.api.Assertions;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList(){

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        assertThat(simpleList).contains("a string value", 123);


    }
    @Test
    public void createATypedList(){
//        List<String> names = new ArrayList<>();
        List<String> names = Arrays.asList("joe", "sally", "pete");
//        List<Integer> ages = new ArrayList<>();
        List<Integer> ages = Arrays.asList(10,30,50);

        assertThat(names).contains("joe", "sally", "pete");
        assertThat(ages).contains(10,30,50);
    }

    @Test
    public void removingStuff(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        names.remove("sally");

        assertThat(names).contains("joe","pete");


    }
}
