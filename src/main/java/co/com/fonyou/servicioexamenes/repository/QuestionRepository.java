package co.com.fonyou.servicioexamenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.fonyou.servicioexamenes.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
