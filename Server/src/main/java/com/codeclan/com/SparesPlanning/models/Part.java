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

    @Column(name="ChangeByHour", nullable = false)
    private int changeByHour;

    @Column(name="ChangeByNumberOfMonths")
    private int changeByNumberOfMonths;

    @Column(name="Priority", nullable = false)
    private int priority;



    // copy for unit part history
    @JsonIgnoreProperties({"parts"})
    //@JsonBackReference
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @OneToMany(mappedBy = "unit")
    private List<UnitPart> unitParts;


//    @ManyToMany()
//    @JsonIgnoreProperties({"parts_history"})
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name="units_parts_history",
//            joinColumns = {@JoinColumn(name="part_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name="unit_id", nullable = false, updatable = false)}
//    )
//    private List<Unit> units_history;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public void increaseHoursRun(Unit unit1, UnitPart part1) {
//        int increase = part1.hoursRun + unit1.getIncreasedRunHours();
//        part1.setHoursRun(increase);
//    }

//    TODO: out this back refactored
//    public void checkPartChange(Unit unit1, Part part1) {
//        if (part1.getHoursRun() + unit1.getNextServiceHours() >= part1.changeByHour ||
//                ChronoUnit.MONTHS.between(part1.getLastChangedDate(), unit1.getNextServiceDate()) >= part1.getChangeByNumberOfMonths()){
//            part1.setChangePart(true);
//        }
//    }

    public void addUnit(Unit unit1) {
        //TODO rewrite
       // units.add(unit1);
    }

    public void addUnitHistory(Unit unit1){
       // units_history.add(unit1);
    }
}


