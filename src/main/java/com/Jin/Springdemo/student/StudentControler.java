package com.Jin.Springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StudentControler {
    @GetMapping
    public List<Student> findAllstudents(){
        return List.of(
                new Student("Jin", "Polak", LocalDate.of(2005, 12, 1), "Contact@polJin.com", 18),
                new Student("Jinv2", "Polakv", LocalDate.of(2004, 6, 15), "Contact@polJinv.com", 19)
        );
    }
}