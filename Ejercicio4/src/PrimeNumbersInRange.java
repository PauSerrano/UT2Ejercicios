import java.util.ArrayList;
import java.util.Scanner;

// Queremos calcular los números primos entre 2 números y imprimirlos por pantalla.
//
//  lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "1 100")
//  lee de la segunda linea de la entrada estándar el número de threads en los que se tiene que dividir el trabajo.
//  lee de la 3a linea de la entrada estándar el número de segundos máximo para realizar la tarea.

//  Cada thread debe encargarse de realizar una parte equivativa del cálculo
//
//    thread 1 [1..50]
//    thread 2 [51..100]
//
//Cada thread debe imprimir por pantalla su id, seguido de la lista de primos en su rango.
//Los ids serán asignados en orden incremental por el thread principal de 1 a N.
//Cada thread siempre tiene que esperar a que finalice el thread anterior antes de imprimir!
//Utiliza el método de implementar Runnable.
//El thread principal debe esperar a la finalización del thread con mayor id (el último).

// ADEMAS:
// El thread principal debe poder cancelar el trabajo de los threads si se sobrepasa
// el límite de tiempo.
// para ello debes utilizar el método interrupt() sobre todos los threads que todavía estén
// vivos (con el método isAlive(), por ejemplo)
// Los threads deben intentar acabar imprimiendo los resultados parciales que han obtenido.

public class PrimeNumbersInRange {
	// Ayuda: utiliza esta lista para guardarte la referencia a los threads que crees
	private static ArrayList<Thread> threads; 

	public static void main(String[] args) {
		// COMPLETA AQUÍ EL EJERCICIO
		Scanner sc = new Scanner (System.in);
		int from, to, numHilos;
		int id=0;
		int numXhilo;
		threads = new ArrayList<>();
		Thread previous=null;
		
		System.out.println("Introduce 2 numeros");
		from = sc.nextInt();
		to = sc.nextInt();
		System.out.println("Introduce el numeros de hilos");
		numHilos= sc.nextInt();	
		
		numXhilo = (to-from)/numHilos;
		Thread t=null;
		
		for (int i=0; i<numHilos;i++){
		
		id++;
		from = numXhilo * i + 1;
		to = from + numXhilo - 1;
		
		
		Runnable r = new CalcPrimeNumbersRunnable (id, from, to, t);
		t = new Thread (r);
		
		threads.add(t);
		
		}
		
		for (Thread tt:threads){
			tt.start();
			
			

			try {
				tt.interrupt();
				tt.join();
				
			} catch (InterruptedException e) {
				System.out.println("El padre decide interumpir al hijo");
				tt.toString();
				
			}
			
			
		}
		
		
		
		
		System.out.println("esperando al ultimo thread para finalizar");


	}

}
