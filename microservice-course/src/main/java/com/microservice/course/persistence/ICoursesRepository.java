package com.microservice.course.persistence;

import com.microservice.course.entities.Course;
import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ICoursesRepository extends CrudRepository<Course, Id> {
    Optional<Object> findById(Long id);
}
