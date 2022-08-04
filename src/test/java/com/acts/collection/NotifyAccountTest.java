package com.acts.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NotifyAccountTest {
    @Test
    public void whenTwoAccountsAddSent() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("123", "P S", "eDer3432f"),
                new Account("142", "P S", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "P S", "eDer3432f"),
                        new Account("142", "P S", "000001")
                )
        );
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenNoD() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "P S", "eDer3432f"),
                new Account("142", "P S", "000001"),
                new Account("142", "P S", "000001"),
                new Account("143", "P S", "000002"),
                new Account("143", "P S", "000002")
        );
        HashSet<Account> x = NotifyAccount.sent(accounts);
        List<Account> accWithOutD = new ArrayList<>(x);
        assertThat(accWithOutD.size()).isEqualTo(3);
    }
}