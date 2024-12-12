package com.Jin.Springdemo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class StudentControler {

    private StudentService service;

    public StudentControler(StudentService service) {this.service = service;}

    @PostMapping
    public Student save(@RequestBody Student stu){
        return service.save(stu);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping
    public Student update(@RequestBody Student stu){
        return service.update(stu);
    }

    @DeleteMapping("/{email}")
    public void deleteByEmail(@PathVariable("email") String email){
        service.deleteByEmail(email);
    }

    @GetMapping
    public List<Student> findAllstudents(){
        return service.findAllstudents();
    }
}