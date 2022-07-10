package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepo extends JpaRepository<Part, Long>{

    List<Part> findByUnits_Id(Long id);

//    @Query("select p from Part p inner join p.units units where units.id = ?1")
//    List<Part> findByUnits_Id(Long id);



}


