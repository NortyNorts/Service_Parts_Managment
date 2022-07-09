package com.codeclan.com.SparesPlanning.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Entity
@Table(name="parts")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="PartName", nullable = false)
    private String partName;

    @Column(name="PartNumber", nullable = false)
    private String partNumber;

    @Column(name="HoursRun")
    private int hoursRun;

    @Column(name="ChangePart", nullable = false)
    private boolean changePart;

    @Column(name="LastChangedDate", nullable = false)
    private LocalDateTime lastChangedDate;

    @Column(name="ChangeByHour", nullable = false)
    private int changeByHour;

    @Column(name="ChangeByNumberOfMonths")
    private int changeByNumberOfMonths;

    @Column(name="Priority", nullable = false)
    private int priority;

    @Column(name="GetDate")
    private LocalDate getDate;


    @ManyToMany()
//    @JsonIgnoreProperties({"parts"})
    @JsonBackReference
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="units_parts",
            joinColumns = {@JoinColumn(name="part_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="unit_id", nullable = false, updatable = false)}
    )
    private List<Unit> units;


    @ManyToMany()
    @JsonIgnoreProperties({"parts_history"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name="units_parts_history",
            joinColumns = {@JoinColumn(name="part_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="unit_id", nullable = false, updatable = false)}
    )
    private List<Unit> units_history;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void increaseHoursRun(Unit unit1, Part part1) {
        int increase = part1.hoursRun + unit1.getIncreasedRunHours();
        part1.setHoursRun(increase);
    }

    public void checkPartChange(Unit unit1, Part part1) {
        if (part1.getHoursRun() + unit1.getNextServiceHours() >= part1.changeByHour ||
                ChronoUnit.MONTHS.between(part1.getLastChangedDate(), unit1.getNextServiceDate()) >= part1.getChangeByNumberOfMonths()){
            part1.setChangePart(true);
        }
    }

    public void addUnit(Unit unit1) {
        units.add(unit1);
    }

    public void addUnitHistory(Unit unit1){
        units_history.add(unit1);
    }
}


