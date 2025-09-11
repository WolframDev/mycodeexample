package co.edu.poli.ejercicio1.model;

public class Rueda {
	
	private String serial;
	private String presion;
	private double diametro;
	private String material;
	private String color;
	
	public Rueda(String serial, String presion, double diametro, String material, String color) {
		super();
		this.serial = serial;
		this.presion = presion;
		this.diametro = diametro;
		this.material = material;
		this.color = color;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getPresion() {
		return presion;
	}

	public void setPresion(String presion) {
		this.presion = presion;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rueda [serial=" + serial + ", presion=" + presion + ", diametro=" + diametro + ", material=" + material
				+ ", color=" + color + "]";
	}

}
