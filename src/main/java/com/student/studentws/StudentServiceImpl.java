package com.student.studentws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentDetails(Integer studentId) {
        return studentRepository.getByStudentId(studentId);
    }
}
