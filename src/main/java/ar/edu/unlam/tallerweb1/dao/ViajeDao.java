package ar.edu.unlam.tallerweb1.dao;



import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Hospedaje;


public interface ViajeDao {
	
	public void agregarHospedaje(Hospedaje hospedaje);
	public List<Hospedaje> listarTipoHospedaje();

}
