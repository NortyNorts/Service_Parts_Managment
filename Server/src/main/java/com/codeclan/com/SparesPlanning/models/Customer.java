package com.codeclan.com.SparesPlanning.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "customer")
    @JsonIgnoreProperties({"customer"})
    private List<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit1) {
        units.add(unit1);
    }




}
