package com.internmain.service.implement;

import com.internmain.models.Student;
import com.internmain.repository.StudentRepository;
import com.internmain.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service// belirtlien sinifin bir servis sinifi oldugunu belirtir
//Servis Nedir??

public class StudentServiceImplement implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImplement(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override//burada bir sıkıntı çıabilir
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);

    }
}
