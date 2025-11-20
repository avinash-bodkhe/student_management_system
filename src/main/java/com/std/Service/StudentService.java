package com.std.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.entity.Student;
import com.std.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // SAVE student
    public void saveStudent(Student s) {
        repo.save(s);
    }

    // GET all students
    public List<Student> getAllStudent() {
        return repo.findAll();
    }
}
