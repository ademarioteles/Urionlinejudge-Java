import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
		int x = 0;
		double y = 0;
	
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextDouble();
	
		System.out.printf("%.3f km/l\n",  (double)x / y);

    }
 
}
