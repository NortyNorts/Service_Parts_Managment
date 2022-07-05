package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.repositories.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnitController {

    @Autowired
    UnitRepo unitRepo;

    @GetMapping(value = "/unit")
    public List<Unit> getAllUnits(){
        return unitRepo.findAll();
    }

}
