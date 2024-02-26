package com.keelient.dockerjava.creditscore.controller;

import com.keelient.dockerjava.creditscore.entity.CreditScore;
import com.keelient.dockerjava.creditscore.repository.CreditScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoreController {

    @Autowired
    CreditScoreRepository creditScoreRepository;

    @GetMapping("/creditscores/{ssn}")
    public CreditScore getCreditScore(@PathVariable("ssn") String ssn) {
        return creditScoreRepository.findById(ssn).get();
    }
}
