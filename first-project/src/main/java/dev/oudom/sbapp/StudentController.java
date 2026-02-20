package dev.oudom.sbapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/koko")
    public Student getStudent() {
        return new Student("ISTAD-001", "Ko Ko", "Male", 11.11);
    }
}
