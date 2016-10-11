import java.util.ArrayList;
import java.util.List;

public class CalcPrimeNumbersThread extends Thread {
	// COMPLETAR AQUÍ EL EJERCICIO
	
	int n1, n2;
	
	public CalcPrimeNumbersThread (int n1, int n2){
		super ();
		this.n1 = n1;
		this.n2 = n2;
	}

	public void run(){
		List<Integer> lista = new ArrayList<>();
		
		lista = PrimeNumbers.primesInRange(n1, n2);
		
		for (Integer i:lista){
			System.out.println(i);
		}
		
	}
	//Prueba commit and push
}
