package com.Jin.Springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllstudents(){
        return List.of(
                new Student("Jin", "Polak", LocalDate.of(2005, 12, 1), "Contact@polJin.com", 18),
                new Student("Student2", "Polakov", LocalDate.of(2004, 6, 15), "Contact@polJinv.com", 19)
        );
    }
}
