package com.Jin.Springdemo.student;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

   @Id
   @GeneratedValue
    private Integer id;

    private String name;

    private String lastname;

    private LocalDate dateofbirth;

    @Column(unique = true)
    private String email;

    @Transient
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        return Period.between(dateofbirth, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }
}