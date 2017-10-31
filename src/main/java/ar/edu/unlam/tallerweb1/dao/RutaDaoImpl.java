package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Hospedaje;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Hospedaje> buscarPorPrecioYDestino(float precio) {
		final Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Hospedaje.class).add(Restrictions.ge("precio", precio)).list();
	
	
	}

}
