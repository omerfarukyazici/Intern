package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentRepository studentRepository;


    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(int id) {
Student student =studentRepository.findById(id).get();
if(student!=null){
    studentRepository.delete(student);
}
    }

    @Override
    public Student updateStudent(int id, Student student) {

      Student oldStudent=  studentRepository.findById(id).get();

      if(oldStudent!=null){
          student.setId(id);
          return studentRepository.save(student);
      }

      return null;
    }
}
