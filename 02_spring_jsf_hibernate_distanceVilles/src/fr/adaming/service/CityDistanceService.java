package fr.adaming.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.adaming.dao.CityDistanceDao;
import fr.adaming.entity.CityDistance;

/**
 * 
 * @author INTI-0332
 *
 */
@Service("cityDistanceServiceBean")
public class CityDistanceService {
	
	@Autowired
	private CityDistanceDao cityDistanceDao;
	
	private Map<String, Map<String, Double>> distanceMap = new HashMap<>();
	
	/**
	 * 
	 * @param srcCity
	 * @param destCity
	 * @return
	 */
	public double findDistance(String srcCity, String destCity) {
		String villeDepart;
		String villeArrivee;
		double distance;
		
		Map<String, Double> destinationMap = new HashMap<>();
		
		List<CityDistance> cityDistancesList = cityDistanceDao.getAllDistances();
		
		for(CityDistance distanceVille : cityDistancesList) {
			villeDepart = distanceVille.getVilleDepart();
			villeArrivee = distanceVille.getVilleArrivee();
			distance = distanceVille.getDistance();
			
			destinationMap.put(villeArrivee, distance);
			distanceMap.put(villeDepart, destinationMap);
		}
		
		//On recupere la ville d arrivee et la distance
		destinationMap.get(srcCity);
		
		if(distanceMap == null) {
			throw new IllegalArgumentException("Ville de depart inconnue.");
		}
		
		//On recupere la distance
		distance = destinationMap.get(destCity);
		
		if(distance == 0) {
			throw new IllegalArgumentException("Ville d'arrivee inconnue.");
		}
		
		return distance;
	}

}
