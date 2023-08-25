package co.com.fonyou.servicioexamenes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.core.CrudMethods;


import co.com.fonyou.servicioexamenes.entity.QuestionExamDTO;

public interface QuestionExamRepository extends JpaRepository<QuestionExamDTO, Integer>{
	
	
	@Query(value="SELECT * FROM question_exam qe WHERE qe.id_exam = ?1 ",nativeQuery = true)
	public List<QuestionExamDTO> findByExam (int id_exam);

}
