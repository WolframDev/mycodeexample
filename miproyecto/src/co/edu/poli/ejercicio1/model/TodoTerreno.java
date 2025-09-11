package co.edu.poli.ejercicio1.model;

public class TodoTerreno extends Bicicleta {

	private String suspension;

	public TodoTerreno(String serial, String color, String tamanio, int peso, double medida, String material,
			Rueda[] rueda, String suspension) {
		super(serial, color, tamanio, peso, medida, material, rueda);
		this.suspension = suspension;
	}

	public String getSuspension() {
		return suspension;
	}

	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}

	@Override
	public String toString() {
		return "TodoTerreno [" + super.toString() + ", suspension=" + suspension + "]";
	}

	@Override
	public double determinarCadencia(double tamPinion) {
		return tamPinion * 5.0;
	}

	public int suma(int a, int b) {
		return a + b;
	}

	public int suma(int a, int b, int c) {
		return a + b + c;
	}
}
