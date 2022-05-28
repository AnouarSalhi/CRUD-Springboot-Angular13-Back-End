package com.rest.restproject.controllers;

import com.rest.restproject.dao.StudentRepository;
import com.rest.restproject.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

     /* get all  Stdents data*/
    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return studentRepository.findAll();
    }

    /* Get a Student using student's id */
    @GetMapping("/students/{id}")
    public Optional<Student> retrieveStudent(@PathVariable(name = "id") Long id){
        return studentRepository.findById(id);
    }

    /* To save new student */
    @PostMapping("/students")
    public Student saveNewStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
    /* To update an existing student */
    @PutMapping ("/students/{id}")
    public Student updateStudent(@PathVariable(name = "id") Long id,@RequestBody Student student){
        student.setId(id);
        return studentRepository.save(student);
    }

    /* To delete an existing student */
    @DeleteMapping("/students/{id}")
    public void delteStudent(@PathVariable(name = "id") Long id){
      studentRepository.deleteById(id);
    }
}
