package com.Jin.Springdemo.student;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;



public interface StudentService {

    Student save(Student s);

    List<Student> findAllstudents();

    Student findByEmail(String email);

    Student update(Student s);

    void deleteByEmail(String email);
}
