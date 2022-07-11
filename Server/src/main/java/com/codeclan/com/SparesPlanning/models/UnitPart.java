package com.codeclan.com.SparesPlanning.models;

import lombok.*;

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
    private Unit unit;

    @ManyToOne
    @JoinColumn(name="part_id")
    private Part part;

    @Column(name="change_part",columnDefinition = "boolean default false")
    private Boolean changePart = false;
}
