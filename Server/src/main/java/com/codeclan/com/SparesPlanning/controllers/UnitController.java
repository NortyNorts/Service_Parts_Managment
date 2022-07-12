package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.repositories.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UnitController {

    @Autowired
    UnitRepo unitRepo;

    //get all
    @GetMapping(value = "/units")
    public List<Unit> getAllUnits(){
        return unitRepo.findAll();
    }

    //get one
    @GetMapping(value="/units/{id}")
    public ResponseEntity<Unit> getUnit(@PathVariable Long id) {
        return new ResponseEntity(unitRepo.findById(id), HttpStatus.OK);
    }

    //add one
    @PostMapping(value="/units/{id}")
    public ResponseEntity<Unit>postUnit(@RequestBody Unit unit){
        unitRepo.save(unit);
        return new ResponseEntity<>(unit, HttpStatus.CREATED);
    }

    //get all units by customer ID
//    @GetMapping(value = "/units/customers/{id}")
//    public ResponseEntity<List<Unit>> findUnitsByCustomerId(
//            //@PathVariable Long id,
//            @RequestParam(name="named") Long id)
//    {
//        return new ResponseEntity<>(unitRepo.findByCustomer_Id(id), HttpStatus.OK);
//    }

}
