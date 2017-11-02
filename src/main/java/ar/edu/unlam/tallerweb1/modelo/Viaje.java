package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Viaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idViaje;
	private String salida;
	private String llegada;
	private String tipoHospedaje;
	private int cantidadDias;
	private int cantidadPersonas;
    private float precio;
    private String descripcion;
    
    
	@OneToOne
    private Hospedaje hospedaje;
    
	public Long getIdViaje() {
		return idViaje;
	}
	public void setIdViaje(Long idViaje) {
		this.idViaje = idViaje;
	}
	public String getSalida() {
		return salida;
	}
	public void setSalida(String salida) {
		this.salida = salida;
	}
	public String getLlegada() {
		return llegada;
	}
	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}
	public String getTipoHospedaje() {
		return tipoHospedaje;
	}
	public void setTipoHospedaje(String tipoHospedaje) {
		this.tipoHospedaje = tipoHospedaje;
	}
	public int getCantidadDias() {
		return cantidadDias;
	}
	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Hospedaje getHospedaje() {
		return hospedaje;
	}
	public void setHospedaje(Hospedaje hospedaje) {
		this.hospedaje = hospedaje;
	}
    
}
