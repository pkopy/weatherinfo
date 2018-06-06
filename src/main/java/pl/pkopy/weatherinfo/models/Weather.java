package pl.pkopy.weatherinfo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    @JsonProperty("main")
    private MainWeather mainWeather;
    private Clouds clouds;
}
