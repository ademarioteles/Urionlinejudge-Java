import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
 
		Locale.setDefault(Locale.US);

		double xu, xd, yu, yd;

		Scanner xy = new Scanner(System.in);

		xu = xy.nextDouble();
		yu = xy.nextDouble();
		xd = xy.nextDouble();
		yd = xy.nextDouble();
		
	System.out.printf("%.4f\n",Math.sqrt(Math.pow(xd - xu, 2) + Math.pow(yd - yu, 2)));

 
    }
 
}
