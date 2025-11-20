package com.std.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.std.entity.Student;
import com.std.Service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // OPEN form
    @GetMapping("/add")
    public String openForm() {
        return "add";
    }

    // SAVE student
    @PostMapping("/save")
    public String save(Student s) {
        service.saveStudent(s);
        return "success";
    }

    // SHOW all students
    @GetMapping("/list")
    public String list(Model m) {
        List<Student> list = service.getAllStudent();
        m.addAttribute("data", list);
        return "list";
    }
}
