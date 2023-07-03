import java.io.IOException;
import java.util.*;


public class Main {
	// LEVEL 3
	public static void main(String[] args){
	Map<Integer, Double> lista = new HashMap();
	Scanner sc = new Scanner(System.in);
		
	lista.put(1, 4.00);
	lista.put(2, 4.50);
	lista.put(3, 5.00);
	lista.put(4, 2.00);
	lista.put(5, 1.50);
	int indice = sc.nextInt();
	int multiplicador = sc.nextInt();
	System.out.printf("Total: R$ %.2f\n", lista.get(indice) * multiplicador);
	
	}

}
