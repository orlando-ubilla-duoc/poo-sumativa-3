package com.duoc.llanquihuetourapp.ui;

import javax.swing.SwingUtilities;

import com.duoc.llanquihuetourapp.data.GestorEntidades;

public class Main {

	public static void main(String[] args) {

		/*
		GestorServicios gestor = new GestorServicios();

		gestor.crearExcursionCultural("Tour Cultural", 2, "Santiago", 60000, "Plaza de Armas");
		gestor.crearExcursionCultural("Tour Histórico", 3, "Valparaíso", 80000, "Cerro Alegre");
		gestor.crearPaseoLacustre("Paseo en Barco", "Puerto Varas", 50000, 2, "Lancha");
		gestor.crearPaseoLacustre("Paseo en Catamarán", "Puerto Montt", 70000, 3, "Catamarán");
		gestor.crearRutaGastronomica("Ruta Gastronómica", 4, "Puerto Varas", 90000, 2);
		gestor.crearRutaGastronomica("Ruta de Sabores", 5, "Puerto Montt", 110000, 3);

		gestor.muestraServicios();
		*/

		// Para manejar de forma global los datos del programa, transversal entre pantallas, sin tener que persistir los datos en disco o medio externo.
		GestorEntidades gestorEntidades = new GestorEntidades();

		SwingUtilities.invokeLater(() -> {
			VistaMenu sumativa3 = new VistaMenu();
		});

	}

}