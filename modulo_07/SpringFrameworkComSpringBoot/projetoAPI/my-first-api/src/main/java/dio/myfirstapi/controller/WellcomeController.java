package dio.myfirstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String welcome() {
        return "welcome to my first API";
    }
}
