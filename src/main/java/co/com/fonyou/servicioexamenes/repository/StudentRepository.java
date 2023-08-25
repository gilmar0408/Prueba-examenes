package co.com.fonyou.servicioexamenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.fonyou.servicioexamenes.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
