package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.UnitPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UnitPartRepo extends JpaRepository<UnitPart,Long> {
    List<UnitPart> findByChangePartTrueOrderByPart_PartNumberAsc();

    List<UnitPart> findByChangePartTrueAndUnit_Customer_IdOrderByPart_PartNumberAsc(Long id);

    List<UnitPart> findByUnit_Customer_IdOrderByPart_PartNumberAsc(Long id);

    List<UnitPart> findByUnit_Id(Long id);

    List<UnitPart> findByUnit_UnitTypeAllIgnoreCase(String unitType);




    @Override
    Optional<UnitPart> findById(Long aLong);
}
