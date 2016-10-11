import java.util.ArrayList;
import java.util.List;

public class CalcPrimeNumbersRunnable implements Runnable {
	private int from;
	private int to;

	public CalcPrimeNumbersRunnable(int from, int to) {
		this.from = from;
		this.to= to;
    }
	
	
	@Override
	public void run() {
		// COMPLETAR AQUÍ EL EJERCICIO
		List<Integer> lista = new ArrayList<>();
		
		lista = PrimeNumbers.primesInRange(from, to);
		
		for (Integer i:lista){
			System.out.println(i);
		}
	}
//comentario
}
