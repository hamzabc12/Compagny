package five.com.project.spring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "societe")
public class societe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String names;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="societe", cascade= {CascadeType.REMOVE,CascadeType.MERGE,CascadeType.REFRESH})
	private List<employe> employes=new ArrayList<employe>();
	@ManyToMany(mappedBy="societe")
	private List<departement> departements=new ArrayList<departement>();
	
	
public societe() {
		
	}

	
public societe(int id, String name) {
	  super();
		this.id = id;
		this.names = name;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return names;
	}


	public void setName(String name) {
		this.names = name;
	}


	
	

	
}
