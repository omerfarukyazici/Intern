package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    public Student createStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public void deleteStudent(int id);

    public Student updateStudent(int id, Student student);


}
