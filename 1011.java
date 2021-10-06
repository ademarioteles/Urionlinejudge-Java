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
 
     	Locale.setDefault(Locale.US);

		double p = 3.14159;
		int r;
		double dv = 4.0/3 ;
		Scanner in = new Scanner(System.in); 
		r= in.nextInt();
	
		System.out.printf("VOLUME = %.3f\n", dv * p * r * r * r  );

 
    }
 
}
