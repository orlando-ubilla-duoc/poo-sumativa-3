package com.duoc.llanquihuetourapp.model;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class GuiaTuristico extends Persona implements Registrable {

	private String especialidad;

	public GuiaTuristico(String nombre, String email, String telefono, String direccion, Rut rut, String especialidad) {
		super(nombre, email, telefono, direccion, rut);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void mostrarResumen() {
		System.out.println("=== INFORMACIÓN DEL GUÍA TURÍSTICO ===");
		System.out.println("Especialidad: " + this.getEspecialidad());
	}
}