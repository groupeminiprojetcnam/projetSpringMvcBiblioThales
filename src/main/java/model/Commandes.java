package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commandes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id; 
	int idClient; 
	Date date;
	int total;
	String infos;
	public Commandes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commandes(int idClient, Date date, int total, String infos) {
		super();
		this.idClient = idClient;
		this.date = date;
		this.total = total;
		this.infos = infos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdClient() {
		return idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getInfos() {
		return infos;
	}
	public void setInfos(String infos) {
		this.infos = infos;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commandes [id=");
		builder.append(id);
		builder.append(", idClient=");
		builder.append(idClient);
		builder.append(", date=");
		builder.append(date);
		builder.append(", total=");
		builder.append(total);
		builder.append(", infos=");
		builder.append(infos);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
}
