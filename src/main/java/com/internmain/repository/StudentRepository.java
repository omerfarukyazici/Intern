package com.internmain.repository;

import com.internmain.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Veritabanı işlemlerini gerçekleştirme yeteneği olan yapıldığı repository sınıfnı belirtir.

//İnterface: ????
public interface StudentRepository extends JpaRepository<Student,Long> {
}
