package com.acts.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("P");
        names.add("A");
        names.add("S");
        names.add("T");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
