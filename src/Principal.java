
/*
Ejercicio 1

Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares
 */

public class Principal {

	public static void main(String[] args) {
		
		int cant = 0;
		
		for (int i = 0; i <10; i++) {
			System.out.println(i+1);			
		}

		System.out.println();
		
		for (int i = 1; i <20; i+=2) {
			cant = cant+1;
			System.out.println("el impar n°: "+cant+" es: "+i);
		}
		
		System.out.println();
		System.out.println("Cambio desde github");
		System.out.println("Hello world. Git is awesome!!");
		
	}

}
