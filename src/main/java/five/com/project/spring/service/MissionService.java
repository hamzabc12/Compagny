package five.com.project.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import five.com.project.spring.entities.Missions;
import five.com.project.spring.repository.missionRepository;

@Service
public class MissionService implements ImissionService {

	public MissionService() {
		
	}
	@Autowired
	private missionRepository repository;
	@Override
	public List<Missions>findAll(){
		return(List<Missions>)repository.findAll();
	}

}
