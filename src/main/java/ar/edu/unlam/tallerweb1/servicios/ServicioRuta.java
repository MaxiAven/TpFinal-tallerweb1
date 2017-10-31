package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Hospedaje;
import ar.edu.unlam.tallerweb1.modelo.Ruta;


public interface ServicioRuta {
	
	public void agregarRuta(Ruta r);
	public List<Hospedaje> buscarPorPrecioYDestino(float precio);

}
