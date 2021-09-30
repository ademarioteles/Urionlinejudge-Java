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
		
double x,y;
Scanner in = new Scanner(System.in);
x =  in.nextDouble();
y = in.nextDouble();

x = x * 3.5;
y = y * 7.5;



System.out.printf("MEDIA = %.5f\n", (x + y )/ 11);

	}
 
}