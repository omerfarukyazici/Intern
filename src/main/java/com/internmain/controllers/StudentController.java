package com.internmain.controllers;


import com.internmain.entities.Student;
import com.internmain.repositories.StudentRepository;
import com.internmain.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentRepository studentRepository){
        this.studentService= studentService;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

     @PostMapping
    public Student  createStudent(@RequestBody Student newStudent){
        return studentService.saveOneStudent(newStudent);
     }

     @GetMapping("/{studentId}")
    public Student getOneStudent(@PathVariable Long studentId){
        return studentService.getOneStudentById(studentId);
     }

     @PutMapping("/{studentId}")
    public Student updateOneStudent(@PathVariable Long studentId, @RequestBody Student newStudent){
        return  studentService.updateOneStudent(studentId,newStudent);
     }
     @DeleteMapping("/{studentId}")
    public void deleteOneStudent(@PathVariable Long studentId){
         studentService.deleteById(studentId);
     }
}
