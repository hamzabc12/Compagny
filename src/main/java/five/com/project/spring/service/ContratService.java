package five.com.project.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import five.com.project.spring.entities.Contrat;
import five.com.project.spring.repository.contratRepository;

@Service
public class ContratService implements IcontratService {
	

	public ContratService() {
		
	}
	@Autowired
	private contratRepository repository;
	@Override
	public List<Contrat> findAll(){;
	return (List<Contrat>)repository.findAll();
	}
}
