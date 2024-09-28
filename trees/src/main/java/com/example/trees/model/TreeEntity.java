package com.example.trees.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "trees")
public class TreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    private String scientificName;
    private String origin;
    private String prefferedClimate;
    private double height;
    private String family;
    private String color;
    private boolean poisonous;

    public TreeEntity(String name, String scientificName, String origin, String prefferedClimate, double height, String family, String color, boolean poisonous) {
        this.name = name;
        this.scientificName = scientificName;
        this.origin = origin;
        this.prefferedClimate = prefferedClimate;
        this.height = height;
        this.family = family;
        this.color = color;
        this.poisonous = poisonous;
    }

    public TreeEntity(String name, String color, boolean poisonous) {
        this.name = name;
        this.color = color;
        this.poisonous = poisonous;
    }
}

