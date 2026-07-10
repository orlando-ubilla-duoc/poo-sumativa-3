package com.duoc.llanquihuetourapp.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.Font;

public class VistaIngreso {

	JFrame ventana;
	JFrame framePadre;
	JTextField txtCampo1;

	public VistaIngreso(JFrame padre, GestorEntidades gestor, String titulo) {
		this.framePadre = padre;
		this.gestorEntidades = gestor;
		ventana = new JFrame(titulo);
		ventana.setSize(640,480);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.PAGE_AXIS));
	}

	private void ConfigComponents(){

		// Panel para campos de texto
		JPanel panelForm1 = new JPanel();
		panelForm1.setLayout(new BoxLayout(panelForm1, BoxLayout.PAGE_AXIS));
		panelForm1.setPreferredSize(new Dimension(640, 180));

		// Panel para los botones
		JPanel panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(1, 1, 10, 10));
		panelButtons.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
		panelButtons.setPreferredSize(new Dimension(640, 70));
		
		JPanel panelPadding = new JPanel(); // para ordenar espacio visual en formulario :P
		panelPadding.setPreferredSize(new Dimension(640, 230));

		// Cambia fuente y tamaño
		txtPatente = new JTextField();
		txtPatente.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtKms     = new JTextField();
		txtKms.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtLts     = new JTextField();
		txtLts.setFont(new Font("Monospaced", Font.PLAIN, 14));

		JLabel lblPatente     = new JLabel("Patente:");
		lblPatente.setSize( 60, 60);
		JLabel lblKms     = new JLabel("Kilometros recorridos:");
		lblKms.setSize( 60, 60);
		JLabel lblLts     = new JLabel("Litros cargados:");
		lblLts.setSize( 60, 60);

		JButton btnAgregar   = new JButton("Agregar");
		JButton btnReset    = new JButton("Limpiar formulario");
		JButton btnCancelar = new JButton("Cancelar/Cerrar");
		
		// eventos de botones
		btnAgregar.addActionListener(e->GuardarConsumoBencina());
		btnReset.addActionListener(e->ResetFormulario());
		btnCancelar.addActionListener(e->CancelarFormulario());

		panelForm1.add(lblPatente);
		panelForm1.add(txtPatente);
		panelForm1.add(lblKms);
		panelForm1.add(txtKms);
		panelForm1.add(lblLts);
		panelForm1.add(txtLts);
		
		panelButtons.add(btnAgregar);
		panelButtons.add(btnReset);
		panelButtons.add(btnCancelar);

		ventana.add(panelForm1);
		ventana.add(panelButtons);
		ventana.add(panelPadding);
	}

	private boolean validarFormulario(String str_patente, String str_kms, String str_lts){
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
	}

	private void GuardarConsumoBencina(){
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
	}
	
	private void ResetFormulario(){
		txtPatente.setText("");
		txtKms.setText("");
		txtLts.setText("");
		txtPatente.requestFocusInWindow();
	}

	private void CancelarFormulario(){
		ventana.dispose();
	}


}