package five.com.project.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import five.com.project.spring.entities.Missions;

public interface missionRepository extends JpaRepository<Missions,Integer> {

}
