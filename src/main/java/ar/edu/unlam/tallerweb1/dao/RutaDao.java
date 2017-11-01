package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Hospedaje;
import ar.edu.unlam.tallerweb1.modelo.Ruta;

public interface RutaDao {
	
	public void agregarRuta(Ruta r);
	
	public List<Hospedaje> buscarPorPrecioYDestino(float precio);
	
	Ruta consultarRutaPorId(Long id);

}
