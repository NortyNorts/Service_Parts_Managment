package com.codeclan.com.SparesPlanning.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="CompanyName", nullable = false)
    private String companyName;

    @Column(name="SiteName", nullable = false)
    private String siteName;

    @Column(name="SiteAddress", nullable = false)
    private String siteAddress;

    @Column(name="SitePostCode", nullable = false)
    private String sitePostCode;

    @Column(name="EngineerVisitsPerYear", nullable = false)
    private int engineerVisitsPerYear;

    @Column(name="NextServiceDate")
    private LocalDate nextServiceDate;

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties({"customer"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit1) {
        units.add(unit1);
    }


    public Long findCustomer(Customer customer){
        return customer.id;
    }

}
