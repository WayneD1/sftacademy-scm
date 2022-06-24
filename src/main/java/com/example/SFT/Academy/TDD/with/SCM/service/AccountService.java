package com.example.SFT.Academy.TDD.with.SCM.service;

import com.example.SFT.Academy.TDD.with.SCM.Account;
import com.example.SFT.Academy.TDD.with.SCM.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    public List<Account> getAll() {

        return accountRepository.findAll();
    }

//    public void createAccount(Account account) {
//
//    }
//
    public void deposit(Double depositAmount, String name){

        Account accountFoundByName = accountRepository.findByName(name);
        Double currentBalance = accountFoundByName.getBalance() + depositAmount;
        accountFoundByName.setBalance(currentBalance);
        accountRepository.save(accountFoundByName);

    }
    public void withdraw(Double withDrawAmount, String name){
        double withdrawCharge = 10.0;

        Account accountFoundByName = accountRepository.findByName(name);
        Double currentBalance = accountFoundByName.getBalance() - withDrawAmount - withdrawCharge;
        accountFoundByName.setBalance(currentBalance);
        accountRepository.save(accountFoundByName);

    }

    public Account getAccountInfo(String name){

        return accountRepository.findByName(name);
    }


}
