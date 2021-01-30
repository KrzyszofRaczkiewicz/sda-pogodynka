package com.sda.pogodynka.backend.location;

import com.sda.pogodynka.backend.LocationDAOMock;
import com.sda.pogodynka.backend.location.Location;
import com.sda.pogodynka.backend.location.LocationDAO;
import com.sda.pogodynka.backend.location.LocationService;
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
        assertThat(location.getCity()).isEqualTo("Gdansk");
        assertThat(location.getRegion()).isEqualTo("Pomorskie");
        assertThat(location.getCountry()).isEqualTo("Polska");
        assertThat(location.getGeoHeight()).isEqualTo(40.0f);
        assertThat(location.getGeoWidth()).isEqualTo(50.0f);
    }

    @Test
    void createLocation_whenCityHasNullValue_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation(null, 40, 50, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isExactlyInstanceOf(RuntimeException.class);
    }

    @Test
    void createLocation_whenHeightIsMoreThan90_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation("Gdansk", 91, 50, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isExactlyInstanceOf(RuntimeException.class);
    }

    @Test
    void createLocation_whenHeightIsLessThan90negative_throwsAnException() {
        // when
        Throwable throwable = catchThrowable(() -> locationService.createLocation("Gdansk", -91, 90, "Pomorskie", "Polska"));

        // then
        assertThat(throwable).isExactlyInstanceOf(RuntimeException.class);
    }
}
