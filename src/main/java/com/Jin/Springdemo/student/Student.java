package com.Jin.Springdemo.student;

import java.time.LocalDate;

public class Student {

    private String name;

    private String lastname;

    private LocalDate dateofbirth;

    private String email;

    private int age;

    public Student(
            String name, String lastname, LocalDate dateofbirth, String email, int age) {

        this.name = name;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.age = age;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
