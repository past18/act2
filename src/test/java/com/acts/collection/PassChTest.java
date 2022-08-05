package com.acts.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassChTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("11400", "past18");
        PassCh office = new PassCh();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestHasDuplicate() {
        Citizen citizen1 = new Citizen("1", "past");
        Citizen citizen2 = new Citizen("1", "someName");
        PassCh office = new PassCh();
        office.add(citizen1);
        office.add(citizen2);
        assertThat(office.get("1").getUsername().equals(citizen2.getUsername())).isFalse();
    }
}