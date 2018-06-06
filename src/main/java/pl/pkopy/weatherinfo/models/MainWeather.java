package pl.pkopy.weatherinfo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainWeather {
    private float temp;
    private float pressure;
    private int humidity;
}
