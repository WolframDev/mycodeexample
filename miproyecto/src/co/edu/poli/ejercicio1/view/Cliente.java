package co.edu.poli.ejercicio1.view;

import co.edu.poli.ejercicio1.model.Bicicleta;
import co.edu.poli.ejercicio1.model.Carrera;
import co.edu.poli.ejercicio1.model.Ejemplo;
import co.edu.poli.ejercicio1.model.Rueda;
import co.edu.poli.ejercicio1.model.TodoTerreno;
/**
 * @autor wolframdev
 */
public class Cliente {

	public static void main(String[] args) {
		
		Rueda rueda1 = new Rueda("GTFD11","23PSI",23.5,"caucho","negro");
		Rueda rueda2 = new Rueda("GTFD12","23PSI",23.5,"caucho","blanco");
		
		Rueda[] ruedas = new Rueda[2];
		ruedas[0] = rueda1;
		ruedas[1] = rueda2;
		
		Bicicleta bici = new Bicicleta("XFSR", "Azul", "XL", 23, 45.3, "acero", ruedas);
		
		System.out.println(bici.getColor());
		bici.setColor("Negro");
		System.out.println(bici.getColor());
		System.out.println(bici);
	
		TodoTerreno bici2 = new TodoTerreno("dTYRY4", "", "", 15, 28.9, "acero", ruedas, "simple");	
	
		System.out.println(bici2.determinarCadencia(5));
		
		System.out.println(bici2);
		
		Ejemplo e1 = new Ejemplo();
		Ejemplo e2 = new Ejemplo("s");
		Ejemplo e3 = new Ejemplo("s","t");
		
		System.out.println("constante "+e1);
		System.out.println("constante "+e2);
		System.out.println("constante "+e3);
		System.out.println("constante "+Ejemplo.val);
		
		/*Polimorfismo*/
		
		TodoTerreno bicit1 = new TodoTerreno("1", null, null, 0, 0, null, ruedas, null);
		TodoTerreno bicit2 = new TodoTerreno("2", null, null, 0, 0, null, ruedas, null);
		Carrera bicic1 = new Carrera("3", null, null, 0, 0, null, ruedas, null);
		
		Bicicleta[] arr = new Bicicleta[3];
		arr[0] = bicit1;
		arr[1] = bicit2;
		arr[2] = bicic1;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getClass().getSimpleName() +" "+arr[i].determinarCadencia(3));
		}
		
		//metodos polimorficos
		System.out.println("Metodo polimorfico1: "+e1.calcular1(bicit2));
		System.out.println("Metodo polimorfico2: "+e1.calcular1(bicic1));
		System.out.println("Metodo polimorfico3: "+e1.calcular2(0).getClass().getSimpleName());
		System.out.println("Metodo polimorfico4: "+e1.calcular2(1).getClass().getSimpleName());
				
		//casting
		int a = 3;
		double b = a;
		
		double y = 3.14;
		int x = (int) y;
		
		Bicicleta b1 = new TodoTerreno(null, null, null, 0, 0, null, ruedas, null);
		Bicicleta b2 = new Carrera(null, null, null, 0, 0, null, ruedas, null);

		TodoTerreno t1 = (TodoTerreno) b1;
		t1.getSuspension();

		Carrera c1 = (Carrera) b2;
		c1.getRin();

		
	}

}
