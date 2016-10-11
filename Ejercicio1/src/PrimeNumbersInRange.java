import java.util.Scanner;

// Queremos calcular los números primos entre 2 números y imprimirlos por pantalla.
//
//Requisitos:
//
//    lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "2 100")
//    Utiliza un thread que realice el trabajo y se encargue de imprimir por pantalla la lista resultante.
//    Utiliza el método de extender un thread (extends Thread)
//    El thread principal debe esperar a la finalización del thread trabajador o "worker".


public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// COMPLETA AQUÍ EL EJERCICIO
		
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("Introduce 2 numeros");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		CalcPrimeNumbersThread hilo1;
		
		hilo1 = new CalcPrimeNumbersThread (n1, n2);
		hilo1.start();
		
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("No salgo hasta que mi hijo acabe");
		

	}

}
