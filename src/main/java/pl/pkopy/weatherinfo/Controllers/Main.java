package pl.pkopy.weatherinfo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pkopy.weatherinfo.models.Weather;
import pl.pkopy.weatherinfo.models.WeatherService;

import java.nio.file.WatchService;
@Controller
public class Main {
    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String weather(){


        return "index";
    }

    @PostMapping("/")
    public String index(@RequestParam ("city") String city,
                        Model model){
//        model.addAttribute("weatherInfo", );

        Weather weater = weatherService.makeCall("radom");
        StringBuilder tekst = new StringBuilder();
        tekst.append(weater.getClouds());
        return tekst.toString();
    }


}
