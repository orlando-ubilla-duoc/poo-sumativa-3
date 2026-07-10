package com.duoc.llanquihuetourapp.model;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class ColaboradorExterno extends Persona implements Registrable {

	private String nombreEmpresa;

	public ColaboradorExterno(String nombre, String email, String telefono, String direccion, Rut rut, String empresa) {
		super(nombre, email, telefono, direccion, rut);
		this.nombreEmpresa = empresa;
	}

	public String getEmpresa() {
		return nombreEmpresa;
	}

	public void setEmpresa(String empresa) {
		this.nombreEmpresa = empresa;
	}

	@Override
	public void mostrarResumen() {
		System.out.println("=== INFORMACIÓN DEL COLABORADOR EXTERNO ===");
		System.out.println("Empresa: " + this.getEmpresa());
	}
}