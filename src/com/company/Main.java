package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<PA10Cities> cities = new HashSet<>();

        cities.add(new PA10Cities(19019, "Philadelphia"));
        cities.add(new PA10Cities(94569, "Pittsburgh"));
        cities.add(new PA10Cities(17025, "Harrisburg"));
        cities.add(new PA10Cities(18503, "Scranton"));
        cities.add(new PA10Cities( 18001, "Allentown"));
        cities.add(new PA10Cities( 17601, "Lancaster city"));
        cities.add(new PA10Cities( 16501, "Erie"));
        cities.add(new PA10Cities(18015, "Bethlehem"));
        cities.add(new PA10Cities(17325, "Gettysburg"));
        cities.add(new PA10Cities(18701, "Wilkes-Barre"));

        Set<PA10Cities> oddZipCode = new TreeSet<>();

        for (PA10Cities result : cities) {
            if (result.getZipCode() % 2 == 1) {
                oddZipCode.add(result);
        }
            }
            oddZipCode.forEach(System.out::println);
            System.out.println("~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~~~~=~~~=~~~=~~~=~~~=~~~=~~~=~~~");
        }
        }