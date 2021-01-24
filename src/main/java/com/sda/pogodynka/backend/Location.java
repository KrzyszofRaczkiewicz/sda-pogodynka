package com.sda.pogodynka.backend;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String miasto;
    private int geoWidthN;
    private int geoWidthS;
    private int geoHightE;
    private int geoHightW;
    private String region;
    private String kraj;
    @Temporal(TemporalType.DATE)
    Date lastInfo;

}
