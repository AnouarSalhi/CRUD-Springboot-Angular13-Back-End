package com.rest.restproject;

import com.rest.restproject.dao.StudentRepository;
import com.rest.restproject.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class RestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestProjectApplication.class, args);



    }

    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return args->{
            studentRepository.save(new Student("Anouar salhi","anwar@gmail.com",new Date()));
            studentRepository.save(new Student("Amin salhi","amin@gmail.com",new Date()));
            studentRepository.save(new Student("karim salhi","karim@gmail.com",new Date()));
        };
    }

}
