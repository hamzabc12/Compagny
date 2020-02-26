package five.com.project.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import five.com.project.spring.entities.departement;

public interface departementRepository extends JpaRepository<departement,Integer> {

}
