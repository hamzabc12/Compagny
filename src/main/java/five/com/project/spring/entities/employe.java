package five.com.project.spring.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employe")
public class employe {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;

private String name;
private String age;
private String adresse;
@ManyToOne(fetch = FetchType.EAGER)
private societe societe;
@OneToMany(fetch = FetchType.EAGER, mappedBy="employe", cascade= {CascadeType.REMOVE,CascadeType.DETACH,CascadeType.MERGE},orphanRemoval=true)
private List<Missions> missions=new ArrayList<Missions>();
@OneToOne
private Contrat contrat;


public employe() {
	
}

public employe(int id, String name, String age, String adresse) {
	//super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.adresse = adresse;
}


	
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}



}
