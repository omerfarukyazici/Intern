package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

        return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudent() {
        return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
    }
    @GetMapping("/delete/{id}")
    public ResponseEntity<String>deleteStudent(@PathVariable int id){

studentService.deleteStudent(id);
        return new ResponseEntity<String>("Delete Succesfully",HttpStatus.OK);
    }
    @PostMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student){


        return new ResponseEntity<Student>(studentService.updateStudent(id, student), HttpStatus.OK);
    }


}
