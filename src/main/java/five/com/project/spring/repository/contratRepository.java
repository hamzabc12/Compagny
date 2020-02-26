package five.com.project.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import five.com.project.spring.entities.Contrat;

public interface contratRepository extends JpaRepository<Contrat,Integer> {

}
