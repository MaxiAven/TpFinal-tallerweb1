package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.RutaDao;
import ar.edu.unlam.tallerweb1.modelo.Ruta;

@Service("servicioRuta")
@Transactional
public class ServicioRutaImpl implements ServicioRuta{
	@Inject
	private RutaDao servicioRutaDao;

	@Override
	public void agregarRuta(Ruta r) {
		
		servicioRutaDao.agregarRuta(r);
	}
	
	
}
