package webApp.studentManagementSystem.service.concrets;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import webApp.studentManagementSystem.entity.Student;
import webApp.studentManagementSystem.repository.StudentRepository;
import webApp.studentManagementSystem.service.abstracts.StudentService;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return this.studentRepository.findAll();
	}

	@Override
	public void addStudent(Student student) {
		this.studentRepository.save(student);
	}

	@Override
	public Optional<Student> student(int id) {
		Optional<Student> student=this.studentRepository.findById(id);
		return student ;
		
	}

	@Override
	public void delete(int id) {
		this.studentRepository.deleteById(id);
		
	}

	@Override
	public Student update(int id, Student student) {
		Optional<Student> updateStudent=this.studentRepository.findById(id);
		if(updateStudent.isPresent()) {
			Student student1=updateStudent.get();
			student1.setFirstName(student.getFirstName());
			student1.setLastName(student.getLastName());
			student1.setEmail(student.getEmail());
			return this.studentRepository.save(student1);
		}
	     return null;
		
	}

}
