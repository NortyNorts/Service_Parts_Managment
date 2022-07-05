package com.codeclan.com.SparesPlanning.repositories;


import com.codeclan.com.SparesPlanning.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
    List<Customer> findByUnits_SerialNumber(String serialNumber);



}
