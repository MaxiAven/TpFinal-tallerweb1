package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.RutaDao;
import ar.edu.unlam.tallerweb1.modelo.Hospedaje;

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
	
	@Override
	public List<Hospedaje> buscarPorPrecioYDestino(float precio) {
		
		return servicioRutaDao.buscarPorPrecioYDestino(precio);
	}
	
	@Override
	public Ruta consultarRutaPorId(Long id) {
		// TODO Auto-generated method stub
		return servicioRutaDao.consultarRutaPorId(id);
	}
	
}
