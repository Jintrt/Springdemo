package com.Jin.Springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DB")
public class DBStudentService implements StudentService {

    private final StudentRepo repo;

    public DBStudentService(StudentRepo repo) {
        this.repo = repo;
    }


    @Override
    public Student save(Student s) {
        return repo.save(s);
    }

    @Override
    public List<Student> findAllstudents() {
        return repo.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return repo.save(s);
    }

    @Override
    public void deleteByEmail(String email) {
        repo.deleteByEmail(email);
    }
}
