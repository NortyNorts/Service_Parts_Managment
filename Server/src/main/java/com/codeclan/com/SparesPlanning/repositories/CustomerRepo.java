package com.codeclan.com.SparesPlanning.repositories;


import com.codeclan.com.SparesPlanning.models.Customer;
import com.codeclan.com.SparesPlanning.models.Forecast;
import com.codeclan.com.SparesPlanning.models.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{

//@Query(value="select c.id as customer_id, u.id as unit_id, p.id as part_id \n" +
//        ",((up.hours_run + u.expected_run_hours_per_year) > p.change_by_hour) changebyhourslapsed\n" +
//        ", ((DATE_PART('year', current_date::date) - DATE_PART('year', last_changed_date::date)) * 12 +\n" +
//        "            (DATE_PART('month', current_date::date) - DATE_PART('month', last_changed_date::date))) as monthselapsed\n" +
//        "              \n" +
//        ",(((DATE_PART('year', current_date::date) - DATE_PART('year', last_changed_date::date)) * 12 +\n" +
//        "            (DATE_PART('month', current_date::date) - DATE_PART('month', last_changed_date::date))) > p.change_by_number_of_months) as servicetimelapsed\n" +
//        "              \n" +
//        ", (last_changed_date + interval '1 month' * p.change_by_number_of_months) as nextservicedate \n" +
//        "    from parts p\n" +
//        "    INNER JOIN units_parts up on up.part_id = p.id\n" +
//        "    INNER JOIN units u on up.unit_id = u.id\n" +
//        "    INNER JOIN customers c on c.id = u.customer_id\n" +
//        "    where c.id = ?1 and u.id = ?2\n" +
//        "    order by p.id", nativeQuery = true)
//    List<Forecast> findByCustomerAndUnitId(Long customer_id, Long unit_id);


}
