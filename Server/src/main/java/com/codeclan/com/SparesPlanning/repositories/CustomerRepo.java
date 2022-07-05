package com.codeclan.com.SparesPlanning.repositories;


import com.codeclan.com.SparesPlanning.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{



}
