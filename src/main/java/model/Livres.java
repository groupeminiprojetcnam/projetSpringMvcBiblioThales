package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livres {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id ;
	String titre;
	String resume; 
	int prix ; 
	int nombrepages;
	public Livres() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livres(String titre, String resume, int prix, int nombrepages) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.prix = prix;
		this.nombrepages = nombrepages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getNombrepages() {
		return nombrepages;
	}
	public void setNombrepages(int nombrepages) {
		this.nombrepages = nombrepages;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livres [id=");
		builder.append(id);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", resume=");
		builder.append(resume);
		builder.append(", prix=");
		builder.append(prix);
		builder.append(", nombrepages=");
		builder.append(nombrepages);
		builder.append("]");
		return builder.toString();
	}
	
}
