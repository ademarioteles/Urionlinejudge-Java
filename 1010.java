import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
Locale.setDefault(Locale.US);
		
int x,y,z,w;
double a,b;

Scanner sx = new Scanner(System.in);

x = sx.nextInt();
y = sx.nextInt();
a = sx.nextDouble();
z = sx.nextInt();
w = sx.nextInt();
b = sx.nextDouble();

System.out.printf("VALOR A PAGAR: R$ %.2f\n", ( y * a) + (w * b));
 
    }
 
}
