package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.entity.CityDistance;

/**
 * 
 * @author INTI-0332
 *
 */
@Repository
public class CityDistanceDao {

	@Autowired
	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Autowired
	public List<CityDistance> getAllDistances() {

		Session session = sessionFactory.openSession();
		
		//par HQL
		String req = "From CityDistance";

		Query request = session.createQuery(req);

		return request.list();
	}

}
