package com.example.project.contoller;

import com.example.project.entity.Account;
import com.example.project.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountContoller {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public List<Account> all(){

//        ArrayList<Account> list = new ArrayList<>();
//        Account account = new Account();
//        account.setUserid(123);
//        list.add(account);

        return accountService.searchAll();
    }
}
