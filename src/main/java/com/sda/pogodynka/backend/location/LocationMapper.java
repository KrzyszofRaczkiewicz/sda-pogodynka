package com.sda.pogodynka.backend.location;

public class LocationMapper {

    LocationDTO reWriteLocation(Location location){
        LocationDTO locationDTO = new LocationDTO();
        locationDTO.setCity(location.getCity());
        locationDTO.setCountry(location.getCountry());
        locationDTO.setGeoWidth(location.getGeoWidth());
        locationDTO.setGeoHight(location.getGeoHeight());

        if(!location.getRegion().isBlank()) locationDTO.setRegion(location.getRegion());

        return locationDTO;
    }
}
