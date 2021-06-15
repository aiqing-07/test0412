package com.myfdc.dao;

import com.myfdc.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudents();
}
