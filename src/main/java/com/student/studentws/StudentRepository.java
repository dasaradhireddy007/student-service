package com.student.studentws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface StudentRepository extends CrudRepository<Student, Integer> {
    public Student getByStudentId(Integer studentId);
}
