package com.example.myapp.dao;

import com.example.myapp.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
