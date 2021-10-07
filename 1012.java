import java.io.IOException;
import java.util.*;
import java.lang.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Locale.setDefault(Locale.US);

		double a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
		System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2  );
		System.out.printf("QUADRADO: %.3f\n", b * b);
		System.out.printf("RETANGULO: %.3f\n", a * b);
    }
 
}
