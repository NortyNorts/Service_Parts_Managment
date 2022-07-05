package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartController {

        @Autowired
        PartRepo partRepo;

        @GetMapping(value = "/part")
        public List<Part> getAllParts(){
            return partRepo.findAll();
        }

}
