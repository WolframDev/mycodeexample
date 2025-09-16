package co.edu.poli.ejercicio1.model;

import java.util.Arrays;
/**
 * @author ws
 * Esta es la clase Bicicleta
 */
public class Bicicleta {
	
	private String serial;
	private String color;
	private String tamanio;
	private int peso;
	private double medida;
	private String material;
	private Rueda[] rueda;
	
	public String att1;
	String att2;
	protected String atte3;
		
	public Bicicleta(String serial, String color, String tamanio, int peso, double medida, String material,
			Rueda[] rueda) {
		super();
		this.serial = serial;
		this.color = color;
		this.tamanio = tamanio;
		this.peso = peso;
		this.medida = medida;
		this.material = material;
		this.rueda = rueda;
	}

	

	public String getSerial() {
		return serial;
	}



	public void setSerial(String serial) {
		this.serial = serial;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getTamanio() {
		return tamanio;
	}



	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public double getMedida() {
		return medida;
	}



	public void setMedida(double medida) {
		this.medida = medida;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public Rueda[] getRueda() {
		return rueda;
	}



	public void setRueda(Rueda[] rueda) {
		this.rueda = rueda;
	}

	

	@Override
	public String toString() {
		return "Bicicleta [serial=" + serial + ", color=" + color + ", tamanio=" + tamanio + ", peso=" + peso
				+ ", medida=" + medida + ", material=" + material + ", rueda=" + Arrays.toString(rueda) + "]";
	}



	public double determinarCadencia (double tamPinion) {
		return tamPinion*2.0;
	}
	

}
