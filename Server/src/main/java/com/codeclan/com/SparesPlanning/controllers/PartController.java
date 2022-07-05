package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartController {

        @Autowired
        PartRepo partRepo;

        //get all
        @GetMapping(value = "/parts")
        public List<Part> getAllParts(){
            return partRepo.findAll();
        }

        //get one
        @GetMapping(value="/parts/{id}")
        public ResponseEntity<Part> getPart(@PathVariable Long id) {
                return new ResponseEntity(partRepo.findById(id), HttpStatus.OK);
        }



}
