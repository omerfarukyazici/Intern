package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


//define entity class
@Entity
@Data
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private  String lastName;

    private String email;

    private Double age;

}
