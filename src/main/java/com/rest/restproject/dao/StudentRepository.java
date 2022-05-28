package com.rest.restproject.dao;

import com.rest.restproject.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;
@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student,Long> {
    @RestResource(path="/findby")
    public List<Student> findByNameContains(@Param(value="mc") String mc);
}
