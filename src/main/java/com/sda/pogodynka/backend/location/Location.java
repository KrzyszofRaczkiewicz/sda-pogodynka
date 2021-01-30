package com.sda.pogodynka.backend.location;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private float geoWidth;
    private float geoHeight;
    private String region;
    private String country;

    public Location(String city, float geoWidth, float geoHeight, String region, String country) {
        this.city = city;
        this.geoWidth = geoWidth;
        this.geoHeight = geoHeight;
        this.region = region;
        this.country = country;
    }
}
