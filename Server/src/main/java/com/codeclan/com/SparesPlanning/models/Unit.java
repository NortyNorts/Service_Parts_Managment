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
@Table(name="units")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="unitType", nullable = false)
    private String unitType;

    @Column(name="SerialNumber", nullable = false)
    private String serialNumber;

    @Column(name="HoursRun", nullable = false)
    private int hoursRun;

    @Column(name="DateInstalled", nullable = false)
    private LocalDateTime dateInstalled;

    @Column(name="ExpectedRunHoursPerYear")
    private int expectedRunHoursPerYear;

    @Column(name="NextServiceDate")
    private LocalDateTime nextServiceDate;

    @Column(name="NextServiceHours")
    private int nextServiceHours;

    @Column(name="IncreasedHours")
    private int increasedRunHours;

    @JsonBackReference
    @ManyToMany
    @JsonIgnoreProperties({"unit"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="units_parts",
            joinColumns = {@JoinColumn(name="unit_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="part_id", nullable = false, updatable = false)}
    )
    private List<Part> parts;

    @JsonBackReference
    @ManyToMany
    @JsonIgnoreProperties({"unit_history"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="units_parts_history",
            joinColumns = {@JoinColumn(name="unit_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="part_id", nullable = false, updatable = false)}
    )
    private List<Part> parts_history;


    @JsonBackReference
    @JsonIgnoreProperties({"units"})
    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addPart(Part part1) {
        parts.add(part1);
    }

    public void addPartHistory(Part part1){
        parts_history.add(part1);
    }

    public void increaseHoursRun(int value, Unit unit1) {
        int increase = value - unit1.getHoursRun();
        unit1.setIncreasedRunHours(increase);
        unit1.setHoursRun(value);
    }

    public void changePart(Part part2) {
        part2.setHoursRun(0);
        part2.setLastChangedDate(LocalDate.now().atStartOfDay());
    }

    public void nextService(Customer customer1, Unit unit1) {
        int hoursNextVisit = unit1.getExpectedRunHoursPerYear() / customer1.getEngineerVisitsPerYear();
        unit1.setNextServiceHours(hoursNextVisit);
    }
}
