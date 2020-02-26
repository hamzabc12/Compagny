package five.com.project.spring.service;

import java.util.List;

import five.com.project.spring.entities.societe;

public interface IsocieteService {
	public List<societe> findAll();

	public void addSociete(societe societe);

	public void updateSociete(int societeId, societe societe);

	public List<societe> getSociete();

	public void deleteSociete(int societeId);
	

}
