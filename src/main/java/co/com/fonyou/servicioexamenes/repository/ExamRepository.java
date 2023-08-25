package co.com.fonyou.servicioexamenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.com.fonyou.servicioexamenes.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam, Integer> {



}
