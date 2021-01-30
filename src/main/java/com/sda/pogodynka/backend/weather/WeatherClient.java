package com.sda.pogodynka.backend.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherClient {
    private final ObjectMapper objectMapper;

    public WeatherClient(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    /*Instant getWeatherJSON() {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("api.openweathermap.org/data/2.5/forecast?lat={lat}&lon={lon}"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String responseBody = httpResponse.body();

            WeatherDTO weatherDTO = objectMapper.readValue(responseBody, WeatherDTO.class);
            String weatherInfo = weatherDTO.getInfo();

            return weatherInfo.toInstant();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Nie można pobrać informacji o czasie");
            return null;
        }
    }*/
}
