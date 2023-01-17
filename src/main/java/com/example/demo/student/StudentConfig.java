package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

/**
 * Ce ficher permet de crer des données test dans données test qui vont être insérer dans la bdd
 */
@Configuration
public class StudentConfig {
//    CommandLIneRunner commandLIneRunner(){
//
//    }

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student siki = new Student(
                    "siki",
                    21,
                    "2000-01-05",
                    "true@argent.tg"
            );
            Student soko = new Student(
                    "soko",
                    21,
                    "2000-01-05",
                    "trsfue@argent.tg"
            );
            repository.saveAll(
                    List.of(siki,soko)
            );
        };
    }
}
