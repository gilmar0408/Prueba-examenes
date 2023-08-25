package co.com.fonyou.servicioexamenes.service;

import java.util.Optional;

import co.com.fonyou.servicioexamenes.entity.AnswerExamResponse;
import co.com.fonyou.servicioexamenes.entity.Student;
import co.com.fonyou.servicioexamenes.entity.StudentResponse;

public interface IStudentService {

	StudentResponse create(Student student);

	Optional<Student> findById(int id);

	AnswerExamResponse getAnswersByStudent(int idStudent);

}
