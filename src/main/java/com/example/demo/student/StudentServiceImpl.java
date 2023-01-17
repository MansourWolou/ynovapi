package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    // ici aussi je fait une injection de dépendance
    public StudentServiceImpl( StudentRepository repository){
        this.studentRepository = repository;
    }
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return studentRepository.findById(Long.valueOf(id));
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }
}
