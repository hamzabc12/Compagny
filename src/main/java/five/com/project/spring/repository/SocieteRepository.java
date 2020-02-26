package five.com.project.spring.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import five.com.project.spring.entities.societe;
@Repository("SocieteRepository")
public interface SocieteRepository extends JpaRepository<societe,Integer > {
	
	

}
