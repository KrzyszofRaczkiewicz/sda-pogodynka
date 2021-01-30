package com.sda.pogodynka.backend;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private float geoWidth;
    private float geoHight;
    private String region;
    private String country;


    public Location(String city, float geoWidth, float geoHight, String region, String country) {
        this.city = city;
        this.geoWidth = geoWidth;
        this.geoHight = geoHight;
        this.region = region;
        this.country = country;
    }

}
