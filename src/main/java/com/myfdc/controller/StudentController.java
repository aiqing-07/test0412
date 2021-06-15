package com.myfdc.controller;

import com.myfdc.domain.Student;
import com.myfdc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("/listStudent.do")
    public List<Student> queryStudnet(){
        List<Student> students = studentService.selectAllStudents();
        return students;
    }

}
