package com.sda.pogodynka.backend;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String miasto;
    private String GeoWidth;
    private String GeoHight;
    private String region;
    private String kraj;
    @Temporal(TemporalType.DATE)
    Date lastInfo;

}
