package org.openweather.api.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class WeatherApiService {

    private final String apiToken;

    public String helloWorld(){
        return "Hello world!";
    }

}
