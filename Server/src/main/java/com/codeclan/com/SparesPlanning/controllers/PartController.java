package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Part;
import com.codeclan.com.SparesPlanning.repositories.PartRepo;
import com.codeclan.com.SparesPlanning.repositories.UnitPartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartController {

        @Autowired
        private PartRepo partRepo;

        @Autowired
        private UnitPartRepo unitPartRepo;

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

        //get parts by unit id
        @GetMapping(value = "/parts/unit/{id}")
        public ResponseEntity<List<Part>> findPartsByUnitId(@PathVariable Long id) {
                return new ResponseEntity(unitPartRepo.findByUnit_Id(id), HttpStatus.OK);
        }

        @GetMapping(value = "/parts/unit/customer/{id}")
        public ResponseEntity<List<Customer>> getCustomerUnitParts(@PathVariable Long id){
                return new ResponseEntity(unitPartRepo.findByUnit_Customer_IdOrderByPart_PartNumberAsc(id),HttpStatus.OK);
        }

}
