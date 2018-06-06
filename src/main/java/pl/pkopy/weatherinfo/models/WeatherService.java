package pl.pkopy.weatherinfo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${opnenweathermap.api_key}")
    private String apiKey;

    public Weather makeCall(String city){
        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity entity = new HttpEntity(httpHeaders);
        httpHeaders.add("key",apiKey);

        Weather response = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+apiKey , Weather.class);

        System.out.println(response);
        return response;
    }
}
