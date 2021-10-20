import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Main {
	// LEVEL 3
	public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
	
	double a = 0, b = 0, c = 0, delta = 0;
	
	Scanner enters = new Scanner(System.in);
	a = enters.nextDouble();
	b = enters.nextDouble();
	c = enters.nextDouble();
	delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
	long nan = (long)delta;

		if (delta < 0 || a <= 0  || nan == 0 ) {

			System.out.println("Impossivel calcular");
			
		} else {

			System.out.printf("R1 = %.5f\n", (b * (-1) + (delta)) / (2*a));
			System.out.printf("R2 = %.5f\n", (b * (-1) - (delta)) / (2*a));
		}

	}

}
