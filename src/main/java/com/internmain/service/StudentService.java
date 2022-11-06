package com.internmain.service;

import com.internmain.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAllStudent();
    Optional<Student> findById(Long id);
    Student saveStudent(Student student);
    Student updateStudent(Student student);

    void deleteStudent(Long id);

}
