package five.com.project.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import five.com.project.spring.entities.employe;
import five.com.project.spring.repository.employeRepository;

@Service
public class employeService implements IemployeService {

	public employeService() {
		
	}
    @Autowired
    private employeRepository employeRepository;
    @Override
	public List<employe> findAll() {
		return (List<employe>)employeRepository.findAll();
	}
	@Override
	public void addEmpl(employe employe) {
		employeRepository.save(employe);
		
	}
	@Override
	public void updateEmploye(int id,employe employe) {
		Optional<employe> emp=employeRepository.findById(id);
		emp.get().setName(employe.getName());
		emp.get().setAge(employe.getAge());
		emp.get().setAdresse(employe.getAdresse());
		employeRepository.save(emp.get());
	}
	
	@Override
	public void deleteEmploye(int employeId) {
		employeRepository.deleteById(employeId);
	}
	@Override
	public List<employe> getEmploye() {
     return employeRepository.findAll();
	}
}

