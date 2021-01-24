package com.sda.pogodynka.backend;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private int geoWidth;
    private int geoHight;
    private String region;
    private String country;
}
