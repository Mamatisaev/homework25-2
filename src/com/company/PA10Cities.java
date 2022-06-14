package com.company;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;


public class PA10Cities implements Comparable<PA10Cities> {
    private int zipCode;
    private String name;


    public PA10Cities(int zipCode, String name) {
        this.zipCode = zipCode;
        this.name = name;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "PA Top 10 Cities - " +
                "zipCode is " + zipCode +
                ", City name is " + name +
                ".";
    }


    @Override
    public int compareTo(PA10Cities o) {
        return o.getZipCode() - this.getZipCode();
    }
}
