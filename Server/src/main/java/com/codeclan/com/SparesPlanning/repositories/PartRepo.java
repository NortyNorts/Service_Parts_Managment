package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepo extends JpaRepository<Part, Long>{
    @Query("select p from Part p inner join p.unitParts unitParts where unitParts.id = ?1")
    List<Part> findByUnitParts_Id(Long id);


    //List<Part> findByUnits_Id(Long id);

//    @Query("select p from Part p inner join p.units units " +
//            "where p.changePart = true and units.customer.id = ?1 " +
//            "order by p.partNumber")
//    List<Part> findByChangePartTrueAndUnits_Customer_IdOrderByPartNumberAsc(Long id);

//    @Query("select p from Part p where p.changePart = ?1 order by p.partNumber")
//    List<Part> findByChangePartOrderByPartNumberAsc(boolean changePart);



//    @Query("select p from Part p inner join p.units units where units.id = ?1")
//    List<Part> findByUnits_Id(Long id);



}


