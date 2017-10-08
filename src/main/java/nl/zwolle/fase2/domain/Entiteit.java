package nl.zwolle.fase2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Entiteit {
	@Id
	@GeneratedValue
	private Long id;
	
	private String naam;
	
	public Entiteit(String naam){
		this.naam = naam;
	}
	public Entiteit() {}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
