package com.sda.pogodynka.backend;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class LocationServiceTest {

    private static LocationService locationService;

    @BeforeAll
    static void setUp() {
        LocationDAO locationDAOImpl = new LocationDAOMock();
        locationService = new LocationService(locationDAOImpl);
    }

    @Test
    void createLocation_createsNewLocation(){
        // when
        Location location = locationService.createLocation("Gdansk", 40, 50, "Pomorskie", "Polska");

        // then
        assertThat(location).isNotNull();
    }

    @Test
    void createLocation_whenCityHasNullValue_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation(null, 40, 50, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }


    @Test
    void createLocation_whenHeightIsMoreThan90_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation("Gdansk", 91, 50, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }

    @Test
    void createLocation_whenHeightIsLessThan90negative_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation("Gdansk", -91, 90, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isInstanceOf(RuntimeException.class);
    }
}
