package co.edu.poli.ejercicio1.model;

/**
 * @author ws
 * Esta es la clase Ejemplo
 */
public class Ejemplo {

	String s;
	String t;
	//constante de clase
	public static final int A = 1;
	public static int val;
	
	public Ejemplo() {
	}

	public Ejemplo(String s) {
		this.s = s;
	}

	public Ejemplo(String s, String t) {
		this.s = s;
		this.t = t;
	}
	
	public double calcular1 (Bicicleta t) {
		return t.determinarCadencia(3);
	}
	
	public Bicicleta calcular2 (int x) {
		if (x==0)
			return new TodoTerreno(s, s, t, x, x, t, null, s);
		else 
			return new Carrera(s, s, t, x, x, t, null, s);
	}
	
}
