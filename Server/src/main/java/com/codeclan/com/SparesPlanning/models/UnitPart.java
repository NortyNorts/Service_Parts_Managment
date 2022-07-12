package com.codeclan.com.SparesPlanning.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

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
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Unit unit;

    @ManyToOne
    @JsonIgnoreProperties({"unitParts"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name="part_id")
    private Part part;

    @Column(name="change_part",columnDefinition = "boolean default false")
    private Boolean changePart = false;


    //Special constructor for the clone WITHOUT an id
    public UnitPart(UnitPart up) {
        this.id = null;
        this.unit = up.unit;
        this.part = up.part;
    }
}
