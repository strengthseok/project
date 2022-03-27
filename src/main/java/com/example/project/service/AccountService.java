package com.example.project.service;

import com.example.project.entity.Account;
import com.example.project.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> searchAll() {
        return accountRepository.findAll();
    }
}
