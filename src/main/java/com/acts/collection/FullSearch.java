package com.acts.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task li : list) {
            numbers.add(li.getNumber());
        }
        return numbers;
    }
}
