package five.com.project.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import five.com.project.spring.entities.societe;
import five.com.project.spring.repository.SocieteRepository;
@Transactional
@Service
public class SocieteService  implements IsocieteService {

	public SocieteService() {
	
	}
	 @Autowired
	 private SocieteRepository repository;
	 @Override
	 public List<societe> findAll(){
		 return (List<societe>)repository.findAll();
	 }
	 
	 @Override
	 public void addSociete(societe societe) {
		 repository.save(societe);
		 
	 }
	 
	 @Override
	 public void updateSociete(int societeId, societe societe) {
		 Optional<societe>soc= repository.findById(societeId);
		 soc.get().setName(societe.getName());
		 repository.save(soc.get());
		 
	 }
	 @Override
	 public void deleteSociete(int societeId) {
		 repository.deleteById(societeId);
	 }
	 @Override
	 public List<societe>getSociete(){
		 return repository.findAll();
	 }
	 
}
