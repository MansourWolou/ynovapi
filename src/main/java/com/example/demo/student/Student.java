package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName =  "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "student_sequence")
    private long id;
    private String name;
    private String email;
    private String dob;
    private Integer age;



    public Student() {
    }

    public Student(long id,
                   String name,
                   String email,
                   String dob,
                   Integer age
                   ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }
    public Student(
                   String name,
                   Integer age,
                   String dob,
                   String email) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public long getId() { 
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
