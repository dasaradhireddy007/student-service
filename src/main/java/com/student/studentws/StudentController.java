package com.student.studentws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class StudentController {

@Value("${student.ws.value}")
private String value;

@Autowired
private StudentService studentService;

    @GetMapping(value = "/student/{studentId}")
    public @ResponseBody ResponseEntity<Student> getStudents(@PathVariable Integer  studentId){
        return new ResponseEntity<Student>( studentService.getStudentDetails(studentId),HttpStatus.OK);
    }
}
