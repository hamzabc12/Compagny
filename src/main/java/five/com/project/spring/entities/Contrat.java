package five.com.project.spring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contrat")
public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@OneToOne(fetch = FetchType.EAGER, mappedBy="contrat", cascade=CascadeType.ALL)
	private employe employe;
	private String type;
	private String dateDeb;
	private String dateFin;
	

	public Contrat() {
		
	}
	public Contrat(int id, String type, String dateDeb, String dateFin) {
		this.id = id;
		this.type = type;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	

}
