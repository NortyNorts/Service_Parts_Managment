package com.codeclan.com.SparesPlanning.repositories;

import com.codeclan.com.SparesPlanning.models.Forecast;
import net.bytebuddy.asm.Advice;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomForecastRepoImpl implements CustomForecastRepo{
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Forecast> findForecastByCustomerAndUnitId(Long cid, Long uid) {
        List<Forecast> forecastList = new ArrayList<>();

        javax.persistence.Query query = entityManager.createNativeQuery("select " +
                        "c.id as customer_id," +
                        "u.id as unit_id," +
                        "p.id as part_id, " +
                        "p.part_name as part_name," +
                        "p.part_number as part_number," +
                "((up.hours_run + u.expected_run_hours_per_year) > p.change_by_hour) changebyhourslapsed, " +
                "((DATE_PART('year', current_date) - DATE_PART('year', up.last_changed_date)) * 12 + \n" +
                        "                    (DATE_PART('month', current_date) - DATE_PART('month', up.last_changed_date))) as monthselapsed, " +
                "(((DATE_PART('year', current_date) - DATE_PART('year', up.last_changed_date)) * 12 + \n" +
                        "                    (DATE_PART('month', current_date) - DATE_PART('month', up.last_changed_date))) > p.change_by_number_of_months) as servicetimelapsed, " +
                " (up.last_changed_date + interval '1 month' * p.change_by_number_of_months) as nextservicedate \n" +
                "    from parts p\n" +
                "    INNER JOIN units_parts up on up.part_id = p.id\n" +
                "    INNER JOIN units u on up.unit_id = u.id\n" +
                "    INNER JOIN customers c on c.id = u.customer_id\n" +
                "    where c.id = :cid and u.id = :uid\n" +
                "    order by p.id")
                .setParameter("cid",cid)
                .setParameter("uid",uid);

        List<Object[]> fieldList = query.getResultList();
        for (Object[] field : fieldList) {
                Forecast obj = new Forecast(
                        (BigInteger) field[0]
                        ,(BigInteger) field[1]
                        ,(BigInteger)field[2]
                        ,(String)field[3]
                        ,(String)field[4]
                        ,(Boolean)field[5]
                        ,(Double)field[6]
                        ,(Boolean)field[7]
                        ,(Timestamp)field[8]);
            //System.out.println(obj);
            forecastList.add(obj);
        }
        return forecastList;
    }
}
