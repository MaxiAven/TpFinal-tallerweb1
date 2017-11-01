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
		//final Session session = sessionFactory.getCurrentSession();
		//session.persist(r);
		sessionFactory.getCurrentSession().save(r);
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hospedaje> buscarPorPrecioYDestino(float precio) {
		final Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Hospedaje.class).add(Restrictions.ge("precio", precio)).list();
	
	
	}
	
	@Override
	public Ruta consultarRutaPorId(Long id) {
		final Session sesion = sessionFactory.getCurrentSession();
		//System.out.println("el id en dao es"+ id); // Aca intento guardar el Id de Ruta para la foreingKey de Hospedaje. No sale todavía
		return (Ruta) sesion.createCriteria(Ruta.class)
				.add(Restrictions.eq("id", id))
				.uniqueResult();
	}

}
