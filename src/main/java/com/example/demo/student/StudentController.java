package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController // this notation make this class to serve rest endpoints
@RequestMapping(path = "api/v1" )
public class StudentController {
    private final StudentService studentService;

    @Autowired // cablage auto permettant l'injection d'un object plutot que son instanciation
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //	this is a rest endpoint
    @GetMapping("students")
    public List<Student> getAll(){

        return studentService.findAll();
    }


    @GetMapping("students/{id}")
    public ResponseEntity<Optional<Student>> getPersoneById(@RequestParam Integer id){
        Optional<Student> student = studentService.findById(id);

        return ResponseEntity.ok(student);
    }

    @PostMapping("students/add")
    public void add(@RequestBody Student student){
        System.out.println(student);
        studentService.save(student);
    }

    @DeleteMapping("students/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        studentService.deleteById(id);
        return ResponseEntity.ok("deleted");
    }

    @PostMapping("students/update")
    public ResponseEntity<String> update(@RequestBody Student student){
        studentService.save(student);
        return ResponseEntity.ok("updated");
    }
}
