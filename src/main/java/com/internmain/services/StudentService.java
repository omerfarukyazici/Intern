package com.internmain.services;

import com.internmain.entities.Student;
import com.internmain.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    //Öğrencileri getirecek method
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    //öğrencileri kaydedecek method
    public Student saveOneStudent(Student newStudent){
        return studentRepository.save(newStudent);
    }
    public Student getOneStudentById(Long studentId){
        return studentRepository.findById(studentId).orElse(null);
    }
    public Student updateOneStudent(Long studentId, Student newStudent){
        Optional<Student> student=studentRepository.findById(studentId);
    if(student.isPresent()){
        Student foundStudent=student.get();
        foundStudent.setUserName(newStudent.getUserName());
        foundStudent.setPassword(newStudent.getPassword());
        foundStudent.setName(newStudent.getName());
        foundStudent.setSurname(newStudent.getSurname());
        foundStudent.setEmail(newStudent.getEmail());
        foundStudent.setAge(newStudent.getAge());
        studentRepository.save(foundStudent);
        return foundStudent;
    }
    else {
        return null;
    }

    }
    public void deleteById(Long studentId){
        studentRepository.deleteById(studentId);
    }
    public Student getOneStudentByUserName(String userName){
        return studentRepository.findByUserName(userName);
    }

}
