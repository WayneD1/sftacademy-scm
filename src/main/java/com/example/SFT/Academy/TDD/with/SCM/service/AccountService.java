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
//    public void deposit(Double depositAmount, String name){
//
//    }
//
//    public void withdraw(Double withDrawAmount, String name){
//
//    }
//
//    public Account getAccountInfo(String name){
//
//    }


}
