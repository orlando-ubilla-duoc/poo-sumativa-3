package com.duoc.llanquihuetourapp.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.duoc.llanquihuetourapp.data.GestorEntidades;

public class VistaIngreso {

	private JFrame ventana;
	private JFrame framePadre;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtRut;
	private JComboBox<String> tipoEntidad;
	private GestorEntidades gestorEntidades;

	// Guia
	private JTextField txtAgencia;

	// Colaborador
	private JTextField txtEmpresa;
	private JTextField txtGiro;

	// Vehiculo
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtPatente;
	private JTextField txtColor;
	private JTextField txtAnnio;
	private JTextField txtKms;
	private JTextField txtResponsable; // Nombre-Apellido
	private JTextField txtRutResponsable; // Rut

	public VistaIngreso(JFrame padre, GestorEntidades gestor, String titulo) {
		this.framePadre = padre;
		this.gestorEntidades = gestor;
		this.ventana = new JFrame(titulo);
		this.ventana.setSize(640,480);
		this.ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.ventana.setLocationRelativeTo(null);
		this.ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.PAGE_AXIS));
		this.ventana.setResizable(false);
		ConfigurarComponentes();

		// registro evento al cerrar esta ventana
		this.ventana.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				if( getVentanaPadre()!=null ){
					getVentanaPadre().setVisible(true); // vuelve a mostrar ventana padre
				}
			}

			@Override
			public void windowClosed(WindowEvent e){
				if( getVentanaPadre()!=null ){
					getVentanaPadre().setVisible(true); // vuelve a mostrar ventana padre
				}
			}
		});

		this.ventana.setVisible(true);
	}

	public JFrame getVentanaPadre(){
		return this.framePadre;
	}

	private void ConfigurarComponentes(){

		// Panel para campos de texto
		JPanel panelForm1 = new JPanel();
		panelForm1.setLayout(new GridLayout( 6, 2 , 10, 10));
		panelForm1.setBorder(BorderFactory.createEmptyBorder(30, 20, 10, 20));
		panelForm1.setPreferredSize(new Dimension(640, 200));

		// Panel para los botones
		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(1, 1, 10, 10));
		panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
		panelButtons.setPreferredSize(new Dimension(640, 70));

		// Panel al final del formulario para espaciar.
		JPanel panelPadding = new JPanel();
		panelPadding.setPreferredSize(new Dimension(640, 100));

		// Inicializa elementos del formulario para registrar Entidad
		String opcionesCbx[] = { "Seleccionar tipo", "Guia Turistico", "Vehiculo", "Colaborador Externo"};
		this.tipoEntidad = new JComboBox<>(opcionesCbx);
		this.tipoEntidad.setFont(new Font("Monospaced", Font.PLAIN, 16));

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNombre.setSize( 60, 60);
		this.txtNombre = new JTextField();
		this.txtNombre.setFont(new Font("Monospaced", Font.PLAIN, 16));

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 18));
		lblApellido.setSize( 60, 60);
		this.txtApellido = new JTextField();
		this.txtApellido.setFont(new Font("Monospaced", Font.PLAIN, 16));

		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTelefono.setSize( 60, 60);
		this.txtTelefono = new JTextField();
		this.txtTelefono.setFont(new Font("Monospaced", Font.PLAIN, 16));

		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDireccion.setSize( 60, 60);
		this.txtDireccion = new JTextField();
		this.txtDireccion.setFont(new Font("Monospaced", Font.PLAIN, 16));

		JLabel lblRut = new JLabel("Rut (ej: 10222333-4):");
		lblRut.setFont(new Font("Arial", Font.PLAIN, 18));
		lblRut.setSize( 60, 60);
		this.txtRut = new JTextField();
		this.txtRut.setFont(new Font("Monospaced", Font.PLAIN, 16));

		this.txtAgencia = new JTextField();
		this.txtAgencia.setFont(new Font("Monospaced", Font.PLAIN, 16));
		this.txtAgencia.setVisible(false);

		this.txtEmpresa = new JTextField();
		this.txtEmpresa.setFont(new Font("Monospaced", Font.PLAIN, 16));
		this.txtEmpresa.setVisible(false);

		this.txtGiro = new JTextField();
		this.txtGiro.setFont(new Font("Monospaced", Font.PLAIN, 16));
		this.txtGiro.setVisible(false);

		JLabel lblTipo = new JLabel("Tipo de registro:");
		lblTipo.setSize( 60, 60);
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 18));





		panelForm1.add(lblTipo);
		panelForm1.add(this.tipoEntidad);
		panelForm1.add(lblNombre);
		panelForm1.add(this.txtNombre);
		panelForm1.add(lblApellido);
		panelForm1.add(this.txtApellido);
		panelForm1.add(lblTelefono);
		panelForm1.add(this.txtTelefono);
		panelForm1.add(lblDireccion);
		panelForm1.add(this.txtDireccion);
		panelForm1.add(lblRut);
		panelForm1.add(this.txtRut);
		// campos especifico???

		// Controles
		///////////////////URL urlIcono = VistaIngreso.class.getResource("");
		//////////////////ImageIcon icono = new ImageIcon(urlIcono);
		//////////////////JButton btnRegistrar    = new JButton( "Guardar", icono);
		JButton btnRegistrar    = new JButton("GUARDAR");
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 16));
		JButton btnReset    = new JButton("LIMPIAR");
		btnReset.setFont(new Font("Arial", Font.PLAIN, 16));
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Arial", Font.PLAIN, 16));


		// eventos de botones
		this.tipoEntidad.addActionListener( e->{
			int selectedInt = (int) this.tipoEntidad.getSelectedIndex();
			this.txtAgencia.setText("");
			this.txtEmpresa.setText("");
			this.txtGiro.setText("");
			switch (selectedInt) {
				case 1: // Guia Turistico
					this.txtAgencia.setVisible(true);
					this.txtEmpresa.setVisible(false);
					this.txtGiro.setVisible(false);
					break;
				case 2: // Vehiculo
					this.txtAgencia.setVisible(false);
					this.txtEmpresa.setVisible(false);
					this.txtGiro.setVisible(false);
					break;
				case 3: // Colaborador
					this.txtAgencia.setVisible(false);
					this.txtEmpresa.setVisible(true);
					this.txtGiro.setVisible(true);
					break;
				default:
					this.txtAgencia.setVisible(false);
					this.txtEmpresa.setVisible(false);
					this.txtGiro.setVisible(false);
			}
		});
		btnRegistrar.addActionListener(e->GuardarRegistro());
		btnReset.addActionListener(e->ResetFormulario());
		btnCancelar.addActionListener(e->CancelarFormulario());

		panelButtons.add(btnRegistrar);
		panelButtons.add(btnReset);
		panelButtons.add(btnCancelar);

		ventana.add(panelForm1);
		ventana.add(panelButtons);
		ventana.add(panelPadding);

	}

	private boolean validarFormulario(String str_patente, String str_kms, String str_lts){
		/*
		if( str_patente.isEmpty() ){
			JOptionPane.showMessageDialog( ventana, "El campo 'Patente' no puede estar vacío.", "Valor invalido", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if( str_kms.isEmpty() ){
			JOptionPane.showMessageDialog( ventana, "El campo 'Kms recorridos' no puede estar vacío.", "Valor invalido", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		if( str_lts.isEmpty() ){
			JOptionPane.showMessageDialog( ventana, "El campo 'Litros cargados' no puede estar vacío.", "Valor invalido", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		try {
			str_kms = str_kms.replace(',', '.');// corrige separador de decimal, en caso de mal formato
			str_lts = str_lts.replace(',', '.');// corrige separador de decimal, en caso de mal formato
			txtKms.setText(str_kms);
			txtLts.setText(str_lts);
			double dbl_kms = Double.parseDouble(str_kms);
			double dbl_lts = Double.parseDouble(str_lts);
			if( dbl_kms <= 0 ){
				JOptionPane.showMessageDialog( ventana, "El campo 'Kms recorridos' debe ser mayor a Cero.", "Valor invalido", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			if( dbl_lts <= 0 ){
				JOptionPane.showMessageDialog( ventana, "El campo 'Litros cargados' debe ser mayor a Cero.", "Valor invalido", JOptionPane.ERROR_MESSAGE);
				return false;
			}
		} catch(Exception e){
			JOptionPane.showMessageDialog( ventana, "Ocurrió un error al validar sus datos: " + e.getMessage(), "Error inesperado", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		return true;
		*/
		return false;
	}

	private void GuardarRegistro(){
		// AQUI USAR GESTOR DE ENTIDADES
		//Registrable entidad = new tipo-segun-seleccion();
		this.gestorEntidades.agregarEntidad(null);
		/*
		try {
			if( validarFormulario( txtPatente.getText().trim(), txtKms.getText().trim(), txtLts.getText().trim() )){
				// Crea objeto
				ConsumoBencina cb = new ConsumoBencina(
						txtPatente.getText().trim(),
						Double.parseDouble(txtKms.getText().trim()),
						Double.parseDouble(txtLts.getText().trim())
				);
				if( cb!=null ){
					if( servicio.guardarConsumo(cb) ){
						JOptionPane.showMessageDialog( ventana, "Registro agregado correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		} catch(Exception e){
			JOptionPane.showMessageDialog( ventana, "Ocurrió un error al guardar la compra: " + e.getMessage(), "Error inesperado", JOptionPane.ERROR_MESSAGE);
		}
		*/
	}
	
	private void ResetFormulario(){
		//tipoEntidad.setText("");
		this.txtNombre.setText("");
		this.txtApellido.setText("");
		this.txtTelefono.setText("");
		this.txtDireccion.setText("");
		this.txtRut.setText("");
		this.txtNombre.requestFocusInWindow();
	}

	private void CancelarFormulario(){
		this.ventana.dispose();
	}


}