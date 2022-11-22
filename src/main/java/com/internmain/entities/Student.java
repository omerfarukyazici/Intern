package com.internmain.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    Long id;

    String userName;
    String password;

    String name;
    String surname;
    String email;
    int age;



}
