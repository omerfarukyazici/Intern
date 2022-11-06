package com.internmain;

import com.internmain.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class InternApplication {


    public static void main(String[] args) {
        SpringApplication.run(InternApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Maria",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        22

                )
        );
    }
}


