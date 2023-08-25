package co.com.fonyou.servicioexamenes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.servicioexamenes.entity.AnswerExamResponse;
import co.com.fonyou.servicioexamenes.entity.Student;
import co.com.fonyou.servicioexamenes.entity.StudentRequest;
import co.com.fonyou.servicioexamenes.entity.StudentResponse;
import co.com.fonyou.servicioexamenes.service.IStudentService;

@RestController
@RequestMapping("api/student")
public class StudentController {

	@Autowired
	private IStudentService serviceStudent;

	@PostMapping("/create")
	public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest studentRequest) {

		Student student = new Student();

		student.setAge(studentRequest.getAge());
		student.setCity(studentRequest.getCity());
		student.setName(studentRequest.getFirstName());

		StudentResponse resp = serviceStudent.create(student);

		return new ResponseEntity<StudentResponse>(resp, HttpStatus.CREATED);
	}

	@GetMapping("/getAnswersByStudent/{id}")
	public ResponseEntity<AnswerExamResponse> getAnswersByStudent(@PathVariable("id") int id) {

		return new ResponseEntity<AnswerExamResponse>(serviceStudent.getAnswersByStudent(id), HttpStatus.OK);
	}

}
