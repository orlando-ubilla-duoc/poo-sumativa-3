package com.duoc.llanquihuetourapp.model;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class Vehiculo implements Registrable {

	private String tipoVehiculo;

	public Vehiculo(String nombre, String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public void mostrarResumen() {
		System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
		System.out.println("Tipo de vehículo: " + this.getTipoVehiculo());
	}
}