package com.duoc.llanquihuetourapp.model;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public abstract class Persona {
	private String nombreCompleto;
	private String email;
	private String telefono;
	private String direccion;
	private String ciudad;
	private Rut rut;

	public Persona(String nombre, String email, String telefono, String direccion, Rut rut) {
		this.nombreCompleto = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.rut = rut;
	}

	public String getNombre() { return nombreCompleto;}

	public void setNombre(String nombre) { this.nombreCompleto = nombre;}

	public String getEmail() { return email;}

	public void setEmail(String email) { this.email = email;}

	public String getTelefono() { return telefono;}

	public void setTelefono(String telefono) { this.telefono = telefono;}

	public String getDireccion() { return direccion;}

	public void setDireccion(String direccion) { this.direccion = direccion;}

	public String getCiudad() { return ciudad;}

	public void setCiudad(String ciudad) { this.ciudad = ciudad;}

	public Rut getRut() { return rut;}

	public void setRut(Rut rut) { this.rut = rut;}

	public String toString() {
		return "["+this.getClass().getSimpleName() + "] : " +
			"nombre=" + this.getNombre() + ", \n" +
			"email=" + this.getEmail() + ", \n" +
			"telefono=" + this.getTelefono() + ", \n" +
			"direccion=" + this.getDireccion() + ", \n" +
			"ciudad=" + this.getCiudad() + ", \n" +
			"rut=" + this.getRut().getRut() + ", \n"
		;
	}

}