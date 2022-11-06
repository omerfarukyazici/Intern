package com.internmain.controller;

import java.util.List;
import java.util.Optional;

import com.internmain.models.Student;
import com.internmain.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
@GetMapping
    public List<Student> findAllStudent(){

        return studentService.findAllStudent();
    }
@GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable("id")Long id){
return studentService.findById(id);
    }
@PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
@DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id")Long id){
        studentService.deleteStudent(id);
}

}
