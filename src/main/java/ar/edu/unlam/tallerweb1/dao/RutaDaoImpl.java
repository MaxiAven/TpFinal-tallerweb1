package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Ruta;

@Repository("rutaDao")
public class RutaDaoImpl implements RutaDao{
	@Inject
    private SessionFactory sessionFactory;

	@Override
	public void agregarRuta(Ruta r) {
		final Session session = sessionFactory.getCurrentSession();
		session.persist(r);
		
		
	}
	
	

}
