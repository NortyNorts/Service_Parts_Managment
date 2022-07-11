package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    UnitPartRepo unitPartRepo;

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
    public ResponseEntity<Customer>postCustomer(@RequestBody Customer customer){
        customerRepo.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    //find one by unit serial number
//    @GetMapping(value="/customers/{customerId}/units"){
//        public ResponseEntity<List<Unit>> getUnitsForCustomer(PathVariable)
//    }

//    @PatchMapping("/customer/{id}")
//    public ResponseEntity<Customer> updateUserPartially(
//            @PathVariable(value = "id") Long id,
//            @RequestBody Customer customerDetails){
//        Customer customer = customerRepo.findById(id).orElseThrow();
//        customer.setServiceState(customerDetails.getServiceState());
//        final Customer updatedUser = customerRepo.save(customer);
//        return ResponseEntity.ok(updatedUser);
//    }

    //get all parts by unitchange
    @GetMapping(value="/customerspartstochange/{id}")
    public ResponseEntity<List<Customer>>banana(@PathVariable Long id){
        //return new ResponseEntity(customerRepo.findByIdAndUnits_Parts_ChangePartTrueOrderByUnits_Parts_PartNumberAsc(id), HttpStatus.OK);
        return new ResponseEntity(unitPartRepo.findByChangePartTrueAndUnit_Customer_IdOrderByPart_PartNumberAsc(id),HttpStatus.OK);
    }

    @GetMapping(value="/customerspartstochange")
    public ResponseEntity<List<Customer>>banana2(){
        return new ResponseEntity(unitPartRepo.findByChangePartTrueOrderByPart_PartNumberAsc(),HttpStatus.OK);
    }

    @PostMapping(value="/updatecustomer")
    public ResponseEntity<List<Customer>>banana3(@RequestBody Customer customer){
        return new ResponseEntity(customerRepo.save(customer),HttpStatus.OK);
    }

    @DeleteMapping(value="/deletecustomer/{id}")
    public ResponseEntity<Customer> deleteCustomer (@PathVariable Long id){
        try {
            customerRepo.deleteById(id);
            return new ResponseEntity("Deleted Successfully", HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity("Customer NOT Deleted", HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
