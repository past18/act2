package com.acts.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("p@gmail.com", "p");
        hash.put("a@gmail.com", "a");
        hash.put("s@gmail.com", "s");
        hash.put("t@gmail.com", "t");

        for (Map.Entry<String, String> entry : hash.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+ "="+value);
        }
    }
}
