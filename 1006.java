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
	double x,y,z;
	
	Scanner in = new Scanner(System.in);
		
	x = in.nextDouble();
	y = in.nextDouble();
	z = in.nextDouble();
		System.out.printf("MEDIA = %.1f\n", (x * 2 + y * 3 + z * 5) / 10 );
 
    }
 
}