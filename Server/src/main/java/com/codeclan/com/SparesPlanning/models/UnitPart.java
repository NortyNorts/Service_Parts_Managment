package com.codeclan.com.SparesPlanning.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name="units_parts")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnitPart {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name="unit_id")
    @JsonIgnoreProperties({"unitParts"})
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private Unit unit;

    @ManyToOne
    @JsonIgnoreProperties({"unitParts"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name="part_id")
    private Part part;

    @Column(name="change_part")
    private Boolean changePart = false;

    //Move to unit part and rename to date installed
    @Column(name="DateInstalled")
    private LocalDate getDate = LocalDate.now();

    //Move to unit part
    @Column(name="HoursRun")
    private int hoursRun = 0;

    //Move to unit part history
    @Column(name="LastChangedDate")
    private LocalDate lastChangedDate = LocalDate.now();


    //Special constructor for the clone WITHOUT an id
    public UnitPart(UnitPart up) {
        this.id = null;
        this.unit = up.unit;
        this.part = up.part;
    }

    public void increaseHoursRun(Unit unit1, UnitPart part1) {
        int increase = part1.hoursRun + unit1.getIncreasedRunHours();
        part1.setHoursRun(increase);
    }

    public void checkPartChange(Unit unit1, UnitPart part1) {
        if (part1.getHoursRun() + unit1.getExpectedRunHoursPerYear() >= part1.getPart().getChangeByHour() ||
                ChronoUnit.MONTHS.between(part1.getLastChangedDate(), unit1.getNextServiceDate()) >= part1.getPart().getChangeByNumberOfMonths()){
            part1.setChangePart(true);
        }
    }

}
