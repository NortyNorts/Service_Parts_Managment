package com.codeclan.com.SparesPlanning.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Forecast {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    private String part_name;
    private String part_number;
    private BigInteger customer_id;
    private BigInteger unit_id;
    private BigInteger part_id;
    private Boolean changebyhourslapsed;
    private Integer monthselapsed;
    private Boolean servicetimeLapsed;
    private Timestamp nextservicedate;

    public Forecast(
                    BigInteger customer_id,
                    BigInteger unit_id,
                    BigInteger part_id,
                    String part_name,
                    String part_number,
                    Boolean changebyhourslapsed,
                    Integer monthselapsed,
                    Boolean servicetimeLapsed,
                    Timestamp nextservicedate) {
        this.part_name = part_name;
        this.part_number = part_number;
        this.customer_id = customer_id;
        this.unit_id = unit_id;
        this.part_id = part_id;
        this.changebyhourslapsed = changebyhourslapsed;
        this.monthselapsed = monthselapsed;
        this.servicetimeLapsed = servicetimeLapsed;
        this.nextservicedate = nextservicedate;
    }

}
