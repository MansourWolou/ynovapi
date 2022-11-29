package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


public interface StudentService  {
    List<Student> findAll();
    Optional<Student> findById(Integer id);
    Student save(Student student);

    void deleteById(Integer id);

    void delete(Student student);
}
