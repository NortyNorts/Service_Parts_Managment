package com.codeclan.com.SparesPlanning.controllers;

import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Forecast;
import com.codeclan.com.SparesPlanning.models.Unit;
import com.codeclan.com.SparesPlanning.models.UnitPart;
import com.codeclan.com.SparesPlanning.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    UnitPartRepo unitPartRepo;

    @Autowired
    UnitRepo unitRepo;

    @Autowired
    ForeCastRepo foreCastRepo;

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

    @PostMapping(value="/deletecustomer/{id}")
    public ResponseEntity<Customer> deleteCustomer (@PathVariable Long id){
        try {
            List<UnitPart> unitParts = unitPartRepo.findByUnit_Customer_Id(id);
            //List<Unit> customerUnits = unitParts.get(0).
            for(UnitPart up : unitParts){
                unitPartRepo.deleteById(up.getId());
            }
            //TODO: remove unit here
            customerRepo.deleteById(id);
            return new ResponseEntity("Deleted Successfully", HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity("Customer NOT Deleted", HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping(value="/customers/{cid}/unit/{uid}")
    public ResponseEntity<List<Forecast>>getPartsForecast(@PathVariable Long cid, @PathVariable Long uid) {
        return new ResponseEntity<>(foreCastRepo.findForecastByCustomerAndUnitId(cid, uid), HttpStatus.OK);
    }
}
