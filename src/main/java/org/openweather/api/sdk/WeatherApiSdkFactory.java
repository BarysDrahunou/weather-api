package org.openweather.api.sdk;

import org.openweather.api.service.WeatherApiService;

import java.util.HashSet;
import java.util.Set;

public class WeatherApiSdkFactory {

    private static final Set<WeatherApiService> weatherApiServices = new HashSet<>();

    public static WeatherApiService createInstance(String apiToken) {
        WeatherApiService weatherApiService = new WeatherApiService(apiToken);
        weatherApiServices.add(weatherApiService);
    }
}
