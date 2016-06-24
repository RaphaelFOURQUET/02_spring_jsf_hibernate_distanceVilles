package fr.adaming.managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.adaming.service.CityDistanceService;

/**
 * 
 * @author INTI-0332
 *
 */
@ManagedBean(name="distanceBean")
@SessionScoped
public class DistanceBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String srcCity;
	private String desCity;
	private double distance;
	
	@ManagedProperty(value="#{cityDistanceServiceBean}")
	private CityDistanceService cityDistanceService;
	
	public DistanceBean() {
		super();
	}
	
	public void chercherDistance() {
		this.distance = this.cityDistanceService.findDistance(srcCity, desCity);
	}

	public String getSrcCity() {
		return srcCity;
	}

	public void setSrcCity(String srcCity) {
		this.srcCity = srcCity;
	}

	public String getDesCity() {
		return desCity;
	}

	public void setDesCity(String desCity) {
		this.desCity = desCity;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public CityDistanceService getCityDistanceService() {
		return cityDistanceService;
	}

	public void setCityDistanceService(CityDistanceService cityDistanceService) {
		this.cityDistanceService = cityDistanceService;
	}
	
	

}
