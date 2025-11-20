package com.std.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.std.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
