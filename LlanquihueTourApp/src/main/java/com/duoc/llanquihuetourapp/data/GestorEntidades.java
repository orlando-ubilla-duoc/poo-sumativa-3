package com.duoc.llanquihuetourapp.data;

import java.util.ArrayList;

import com.duoc.llanquihuetourapp.model.Registrable;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class GestorEntidades {

	private ArrayList<Registrable> entidades;

	public GestorEntidades() {
		this.entidades = new ArrayList<>();
	}

	public void agregarEntidad(Registrable entidad) {
		entidades.add(entidad);
	}

	/*public void mostrarResumenEntidades() {
		for (Registrable entidad : entidades) {
			if( entidad instanceof Vehiculo){
				System.out.println("ALGO DISTINTO");
			}
			entidad.mostrarResumen();
			System.out.println(); // Línea en blanco entre resúmenes
		}
	}*/
}