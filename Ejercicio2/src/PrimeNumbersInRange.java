import java.util.Scanner;

// Queremos calcular los números primos entre 2 números y imprimirlos por pantalla.
//
//Requisitos:
//
//    lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "2 100")
//    Utiliza un thread que realice el trabajo y se encargue de imprimir por pantalla la lista resultante.
//    Utiliza el método de implementar Runnable.
//    El thread principal debe esperar a la finalización del thread trabajador o "worker".


public class PrimeNumbersInRange {

	public static void main(String[] args) {
		// COMPLETA AQUÍ EL EJERCICIO

		Scanner sc = new Scanner (System.in);
		int from, to;
		
		System.out.println("Introduce 2 numeros");
		from = sc.nextInt();
		to = sc.nextInt();
		
		Runnable r = new CalcPrimeNumbersRunnable (from, to);
		Thread t = new Thread (r);
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Comprobando el orden de salida");
		

		
		
	}

}
