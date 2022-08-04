package com.acts.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autoNames = new HashSet<>();
        autoNames.add("Lamb");
        autoNames.add("Tesla");
        autoNames.add("BMW");
        for (String auto : autoNames) {
            System.out.println(auto);
        }
    }
}
