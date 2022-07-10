package com.codeclan.com.SparesPlanning.repositories;


import com.codeclan.com.SparesPlanning.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PatchMapping;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

    List<Customer> findByUnits_SerialNumber(String serialNumber);

//    @Query(value="select * from customers as c\n" +
//            "inner join units u on c.id=u.customer_id\n" +
//            "inner join units_parts up on up.unit_id=u.id\n" +
//            "inner join parts p on up.part_id=p.id\n" +
//            "where c.id = ?1 and p.part_name = 'Snap Ring'",
////            "order by p.part_number",
//            nativeQuery = true)
    Optional<Customer> findByIdAndUnits_Parts_ChangePartTrueOrderByUnits_Parts_PartNumberAsc(Long id);

}
