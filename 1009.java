import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	String nome = "";
		double x,y;
		

		Scanner sc = new Scanner(System.in);
		
		nome = sc.next() ; 
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n", x + (y * 0.15));
    }
 
}
