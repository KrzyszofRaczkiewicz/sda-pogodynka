package com.sda.pogodynka.backend;

public class LocationService {

    private final LocationDAO locationDAO;

    public LocationService(LocationDAO locationDAO) {
        this.locationDAO = locationDAO;
    }

    public Location createLocation(String city, int height, int width, String region, String country) throws Exception {

        if(city.isBlank() && country.isBlank()){
            throw new Exception("Nazwa miasta i kraju nie może być pusta!!!");
        }
        if(height>90 || height<-90){
            throw new Exception("Nie ta planeta... wartości od -90 do 90");
        }
        if(width>180 || width<-180){
            throw new Exception("Nie ta planeta... wartości od -180 do 180");
        }
        Location location = new Location(city, height, width, region, country);

        return locationDAO.saveLocation(location);
    }
}
