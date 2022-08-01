package com.acts.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int r = 0;
        for (int[] row : array) {
            int c = 0;
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;

    }

}
