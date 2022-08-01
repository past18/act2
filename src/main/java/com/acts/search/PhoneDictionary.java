package com.acts.search;

import java.util.ArrayList;
import java.lang.String;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Return list of all users, which contain key in any of fields.
     *
     * @param key key of search.
     * @return List of users.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().equals(key) || person.getPhone().equals(key) || person.getSurname().equals(key) || person.getAddress().equals(key)) {
                result.add(person);
            }

        }
        return result;
    }
}
