package com.sda.pogodynka.backend;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String miasto; // todo use english names
    private int geoWidthN; // todo think about the data model
    private int geoWidthS;
    private int geoHightE;
    private int geoHightW;
    private String region;
    private String kraj;  // todo use english names
    @Temporal(TemporalType.DATE)
    Date lastInfo; // todo unnecessary field
}
