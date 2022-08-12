package com.acts.sorting;

import java.util.Comparator;

public class JobIncByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());

    }
}