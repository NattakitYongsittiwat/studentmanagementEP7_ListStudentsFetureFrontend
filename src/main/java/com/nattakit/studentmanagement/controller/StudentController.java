package com.nattakit.studentmanagement.controller;

import com.nattakit.studentmanagement.dto.StudentDto;
import com.nattakit.studentmanagement.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {
    private StudentService  studentService;

    public StudentController (StudentService  studentService){
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String ListStudent(Model model){
        List<StudentDto> students = studentService.getAllStudents();
        model.addAttribute("students",students);
        return "students";
    }
}