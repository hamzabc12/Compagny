package five.com.project.spring.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departement")
public class departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToMany
	@JoinTable(name = "societe_depart", 
	joinColumns = { @JoinColumn(name = "departement_id") },  
	inverseJoinColumns = { @JoinColumn(name = "societe_id") })
	private Set<societe> societe = new HashSet<>();

	private String lastName;
	private String Adresse;
	
public departement() {
		
	}
	
	public departement(int id, String lastName, String adresse) {
		//super();
		this.id = id;
		this.lastName = lastName;
		Adresse = adresse;
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAdresse() {
		return Adresse;
	}


	public void setAdresse(String adresse) {
		Adresse = adresse;
	}


	

	
}
