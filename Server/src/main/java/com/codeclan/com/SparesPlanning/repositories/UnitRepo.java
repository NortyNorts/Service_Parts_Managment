package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnitRepo extends JpaRepository<Unit, Long>{
    @Query("select u from Unit u where u.customer.id = ?1")
    List<Unit> findByCustomer_Id(Long id);











}
