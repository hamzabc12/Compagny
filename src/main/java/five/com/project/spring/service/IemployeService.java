package five.com.project.spring.service;

import java.util.List;

import five.com.project.spring.entities.employe;

public interface IemployeService {
	public List<employe> findAll();
	public void addEmpl(employe employe );
	public void updateEmploye(int id, employe employe);
	public void deleteEmploye(int employeId);
	public List<employe> getEmploye();

}
