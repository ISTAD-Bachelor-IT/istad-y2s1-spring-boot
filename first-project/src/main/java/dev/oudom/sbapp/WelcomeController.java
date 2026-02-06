package dev.oudom.sbapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping("/hi")
    public Map<String, String> getHi() {
        return Map.of("data", "hi");
    }

    @GetMapping("/hello")
    public Map<String, String> getHello() {
        return Map.of("data", "hello");
    }

    @GetMapping("/user")
    public Map<String, Object> getUser() {
        return Map.of(
                "name", "Koko",
                "age", 21,
                "email", "koko@gmail.com",
                "role", "USER"
        );
    }
}
