package five.com.project.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import five.com.project.spring.entities.departement;
import five.com.project.spring.repository.departementRepository;

@Service
public class DepartementService implements IdepartementService {

	public DepartementService() {
		
	}
@Autowired
private departementRepository repository;
@Override
public List<departement> findAll(){
	return (List<departement>)repository.findAll();
}

}
