package com.sda.pogodynka.backend.Location;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationDTO {
    private String city;
    private float geoWidth;
    private float geoHight;
    private String region;
    private String country;
}
