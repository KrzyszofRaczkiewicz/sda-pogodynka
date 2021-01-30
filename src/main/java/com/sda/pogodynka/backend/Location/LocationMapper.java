package com.sda.pogodynka.backend.Location;

public class LocationMapper {

    LocationDTO reWriteLocation(Location location){
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setCity(location.getCity());
        locationDTO.setCountry(location.getCountry());
        locationDTO.setGeoWidth(location.getGeoWidth());
        locationDTO.setGeoHight(location.getGeoHight());

        if(!location.getRegion().isBlank()) locationDTO.setRegion(location.getRegion());

        return locationDTO;
    }
}
