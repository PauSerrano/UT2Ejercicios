import java.util.ArrayList;
import java.util.List;

public class CalcPrimeNumbersRunnable implements Runnable {
	private int id;
	private int from;
	private int to;
	private Thread previous;
	
	// Nos guardamos el id, inicio, fin, y referencia al Runnablethread anterior
	public CalcPrimeNumbersRunnable(int id, int from, int to, Thread previous) {
		this.id = id;
		this.from = from;
		this.to= to;
		this.previous = previous;
    }
	
	@Override
	public void run() {
		// COMPLETAR AQUÍ EL EJERCICIO
		List<Integer> lista = new ArrayList<>();
		
		lista = PrimeNumbers.primesInRange(from, to);
		System.out.println("El id del thread es: "+this.id);
		for (Integer i:lista){
			System.out.println(i);
		}

}


}