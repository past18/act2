package com.acts.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Pa", "St", "534872", "If")
        );
        ArrayList<Person> persons = phones.find("Pa");
        assertThat(persons.get(0).getSurname()).isEqualTo("St");
    }
}