package com.Jin.Springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StudentControler {

    private StudentService service;

    public StudentControler(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> findAllstudents(){
        return service.findAllstudents();
    }
}