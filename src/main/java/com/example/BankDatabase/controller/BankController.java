package com.example.BankDatabase.controller;

import com.example.BankDatabase.model.Bank;
import com.example.BankDatabase.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//It is used to handle request made by client like get,post,delete etc.
@RestController

//It is used to map web requests onto specific handler classes and/or handler methods.
@RequestMapping("api")
public class BankController {

    private final BankService service;

    public BankController(BankService service) {

        this.service = service;
    }

    //@GetMapping tells spring to use our method to answer
    //user request that is sent to localhost:8080/banks
    @GetMapping("banks")
    public List<Bank> getBanks() {

        return service.getBanks();
    }

    //@GetMapping tells spring to use our method to answer
    //user request that is sent to localhost:8080/banks/id
    @GetMapping("banks/{id}")
    public Bank getBank(@PathVariable long id) {
        try {
            if(service.getBank(id) != null) {
                return service.getBank(id);
            } else {
                throw new NullPointerException();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @PostMapping("banks")
    public String  addBank(@RequestBody Bank bank) {
        return service.addBank(bank);
    }

}
