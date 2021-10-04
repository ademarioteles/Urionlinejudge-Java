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
 
int x,y;
double z;
Scanner in = new Scanner(System.in);
x = in.nextInt();
y = in.nextInt();
z = in.nextDouble();
double w = y;

System.out.println("NUMBER = " + x);
System.out.printf("SALARY = U$ %.2f\n", z * w );
 
    }
 
}
