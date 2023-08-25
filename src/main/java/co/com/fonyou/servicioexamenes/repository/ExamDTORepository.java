package co.com.fonyou.servicioexamenes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.com.fonyou.servicioexamenes.entity.ExamDTO;
import jakarta.websocket.server.PathParam;

public interface ExamDTORepository extends JpaRepository<ExamDTO, Integer>{
	
	@Query(value="SELECT * FROM exam e WHERE e.student = ?1 ",nativeQuery = true)
	public Optional<ExamDTO> findExamByStudent (int id_student);

}
