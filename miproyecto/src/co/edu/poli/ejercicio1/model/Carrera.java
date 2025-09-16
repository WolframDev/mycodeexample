package co.edu.poli.ejercicio1.model;

public class Carrera extends Bicicleta {

	private String rin;

	public Carrera(String serial, String color, String tamanio, int peso, double medida, String material, Rueda[] rueda,
			String rin) {
		super(serial, color, tamanio, peso, medida, material, rueda);
		this.rin = rin;
	}

	public String getRin() {
		return rin;
	}

	public void setRin(String rin) {
		this.rin = rin;
	}

	@Override
	public double determinarCadencia(double tamPinion) {
		return tamPinion * 3.0;
	}

	@Override
	public String toString() {
		return "Carrera [rin=" + rin + ", toString()=" + super.toString() + "]";
	}

}
