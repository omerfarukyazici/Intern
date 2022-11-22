package com.internmain.repositories;

import com.internmain.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

Student findByUserName(String userName);
}
