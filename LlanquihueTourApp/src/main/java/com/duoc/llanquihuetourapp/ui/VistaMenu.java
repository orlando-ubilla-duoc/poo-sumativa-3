package com.duoc.llanquihuetourapp.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.duoc.llanquihuetourapp.data.GestorEntidades;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class VistaMenu {

	JFrame ventana;

	public VistaMenu(GestorEntidades gestor) {
		ventana = new JFrame("Gestion de Bencina Vehiculos"); // titulo
		ventana.setSize(400,300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cerrar app
		ventana.setLocationRelativeTo(null); // centrar
		ConfigurarComponentes();
		ventana.setVisible(true);
	}

	/**
	 * Configura los componentes del menú principal.
	 */
	private void ConfigurarComponentes(){
		JPanel panelMenu = new JPanel();
		panelMenu.setLayout(new GridLayout(3, 1, 10, 10));
		panelMenu.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));

		// crear botones para el menu
		JButton boton1 = new JButton("1. Registrar Datos");
		JButton boton2 = new JButton("2. Gestion de Datos");
		JButton boton3 = new JButton("3. Salir");

		// Agrega elementos al menu
		panelMenu.add(boton1);
		panelMenu.add(boton2);
		panelMenu.add(boton3);

		ventana.add(panelMenu, BorderLayout.CENTER);

		boton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// Oculta ventana principal
                ventana.setVisible(false);
				// VistaIngreso ventanaForm1 = new VistaIngreso( ventana, "Gestion de Datos - Registrar");
			}
		});

		boton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// Oculta ventana principal
				ventana.setVisible(false);
			}
		});

		boton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				// Oculta ventana principal
				ventana.setVisible(false);
			}
		});
	}
}