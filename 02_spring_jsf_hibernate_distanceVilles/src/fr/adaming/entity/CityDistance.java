package fr.adaming.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author INTI-0332
 *
 */
@Entity
public class CityDistance {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String villeDepart;
	private String villeArrivee;
	private double distance;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public CityDistance() {
		super();
	}

	public CityDistance(String villeDepart, String villeArrivee, double distance) {
		super();
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.distance = distance;
	}

	public CityDistance(int id, String villeDepart, String villeArrivee, double distance) {
		super();
		this.id = id;
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.distance = distance;
	}
	
	
	

}
