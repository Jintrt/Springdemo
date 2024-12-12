package com.Jin.Springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    private List<Student> STUDENTS = new ArrayList<>();

    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }

    public List<Student> findAllstudents() {
        return STUDENTS;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream().filter(s -> s.getEmail().equals(email)).findFirst().orElse(null);
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, STUDENTS.size()).filter(i -> STUDENTS.get(i).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
        if (studentIndex != -1) {
            STUDENTS.set(studentIndex, s);
            return s;
        }

        return null;
    }

    public void deleteByEmail(String email) {
        var student = findByEmail(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }

}
