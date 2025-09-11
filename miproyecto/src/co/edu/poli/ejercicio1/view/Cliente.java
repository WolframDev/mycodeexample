package co.edu.poli.ejercicio1.view;

import co.edu.poli.ejercicio1.model.Bicicleta;
import co.edu.poli.ejercicio1.model.Ejemplo;
import co.edu.poli.ejercicio1.model.Rueda;
import co.edu.poli.ejercicio1.model.TodoTerreno;
/**
 * @autor wolfram
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
		

		System.out.println("constante "+e3.val);
		
		
	}

}
