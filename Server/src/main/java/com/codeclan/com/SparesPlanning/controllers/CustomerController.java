package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    //get all
    @GetMapping(value = "/customers")
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }

    //get one
    @GetMapping(value="/customers/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id) {
        return new ResponseEntity(customerRepo.findById(id), HttpStatus.OK);
    }

    //add one
    @PostMapping(value="/customers")
    public ResponseEntity<Customer> postCustomer(@PathVariable Customer customer){
        customerRepo.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    //find one by unit serial number
//    @GetMapping(value="/customers/{customerId}/units"){
//        public ResponseEntity<List<Unit>> getUnitsForCustomer(PathVariable)
//    }

}
