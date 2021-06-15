package com.myfdc.service.impl;

import com.myfdc.dao.StudentDao;
import com.myfdc.domain.Student;
import com.myfdc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAllStudents() {
        return studentDao.selectAllStudents();
    }
}
