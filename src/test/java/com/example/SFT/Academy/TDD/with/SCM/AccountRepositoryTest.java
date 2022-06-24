package com.example.SFT.Academy.TDD.with.SCM;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;


    @Test
    @DisplayName("GIVEN valid account, save should persist and return saved account")
    public void testSave() {
        //arrange
        String testAccountName = "john doe";
        String testAccountNumber = "2221111";
        Account account = new Account(testAccountName, testAccountNumber, "checking", 1200000d, 500d);

        //act
        accountRepository.save(account);

        //assert
        Account johnsAccount = accountRepository.findByName(testAccountName);

        assertThat(johnsAccount)
                .extracting("name", "number")
                .containsExactly(testAccountName, testAccountNumber);


    }
}