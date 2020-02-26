package five.com.project.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import five.com.project.spring.entities.employe;

public interface employeRepository extends JpaRepository<employe,Integer> {
	Optional<employe> findByIdAndSocieteId(Integer id, Integer societeId);



}
