package webApp.studentManagementSystem.service.abstracts;

import java.util.List;
import java.util.Optional;

import webApp.studentManagementSystem.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void addStudent(Student student);
	Optional<Student> student(int id);
	void delete(int id);
	Student update(int id,Student student);
	

}
