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

    public Location(){}

    public Location(String city, int geoWidth, int geoHight, String region, String country) {
        this.city = city;
        this.geoWidth = geoWidth;
        this.geoHight = geoHight;
        this.region = region;
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nLocation{" +
                "id=" + id +
                "\n, city='" + city + '\'' +
                "\n, geoWidth=" + geoWidth +
                "\n, geoHight=" + geoHight +
                "\n, region='" + region + '\'' +
                "\n, country='" + country + '\'' +
                '}';
    }
}
