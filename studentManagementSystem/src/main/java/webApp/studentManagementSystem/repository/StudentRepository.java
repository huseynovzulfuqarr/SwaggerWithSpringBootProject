package webApp.studentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import webApp.studentManagementSystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
