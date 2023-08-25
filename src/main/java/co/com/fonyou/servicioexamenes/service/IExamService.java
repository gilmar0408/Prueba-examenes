package co.com.fonyou.servicioexamenes.service;

import java.util.Optional;

import co.com.fonyou.servicioexamenes.entity.AnswerExamRequest;
import co.com.fonyou.servicioexamenes.entity.Exam;
import co.com.fonyou.servicioexamenes.entity.ExamFormat;
import co.com.fonyou.servicioexamenes.entity.ExamResponse;
import co.com.fonyou.servicioexamenes.entity.Score;

public interface IExamService {
	
	ExamResponse create (Exam exam);
	
	ExamFormat getExamByStudent (int id);
	
	Score answerExam (AnswerExamRequest req);
	

}
