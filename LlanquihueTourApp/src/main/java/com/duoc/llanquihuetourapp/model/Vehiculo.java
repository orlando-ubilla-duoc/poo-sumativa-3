package com.duoc.llanquihuetourapp.model;

/**
 *
 * @author	Orlando Ubilla
 * @since	Sumativa-3
 */
public class Vehiculo implements Registrable {

	private String marca;
	private String modelo;
	private String patente;
	private String color;
	private int annio;
	private int kilometros;
	private Persona responsable;

	public Vehiculo(String marca, String modelo, String patente, String color, int annio, int km, Persona reponsable) {
		this.marca   = marca;
		this.modelo  = modelo;
		this.patente = patente;
		this.color   = color;
		this.annio   = annio;
		this.kilometros = km;
		this.responsable = reponsable;
	}

	public String getMarca() { return this.marca;}
	public void setMarca(String m) { this.marca = m;}

	public String getModelo() { return this.modelo;}
	public void setModelo(String m) { this.modelo = m;}

	public String getPatente() { return this.patente;}
	public void setPatente(String p) { this.patente = p;}

	public String getColor() { return this.color;}
	public void setColor(String c) { this.color = c;}

	public int getAnnio() { return this.annio;}
	public void setAnnio(int a) { this.annio = a;}

	public int getKms() { return this.kilometros;}
	public void setKms(int k) { this.kilometros = k;}

	public Persona getResponsable() { return this.responsable;}
	public void setResponsable(Persona r) { this.responsable = r;}


	@Override
	public void mostrarResumen() {
		System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Patente: " + this.getPatente());
		System.out.println("Color: " + this.getColor());
		System.out.println("Año: " + this.getAnnio());
		System.out.println("Kilometraje: " + this.getKms());
		System.out.println("Persona responsable: " + this.getResponsable().getNombre() + "(RUT:"+this.getResponsable().getRut().getRut()+")");
	}
}