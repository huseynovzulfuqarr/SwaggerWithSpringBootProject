package webApp.studentManagementSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import webApp.studentManagementSystem.entity.Student;
import webApp.studentManagementSystem.service.abstracts.StudentService;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class StudentController {
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return this.studentService.getAllStudents();
	}
	
	@PostMapping("/saveStudents")
	public void addStudent(@RequestBody Student student) {
		this.studentService.addStudent(student);
	}
	
	@GetMapping("/getByIdStudent/{id}")
	public Optional<Student> getByIdStudent(@PathVariable("id") int id) {
		return this.studentService.student(id);
	}
	
	@DeleteMapping("/DeleteByIdStudent/{id}")
	public void deletestudent(@PathVariable("id") int id ) {
		this.studentService.delete(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable("id") int id) {
		this.studentService.update(id, student);
	}
}
