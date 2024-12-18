package com.Jin.Springdemo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);

    void deleteByEmail(String email);

}
