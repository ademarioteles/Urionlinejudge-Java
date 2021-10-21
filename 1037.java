import java.io.IOException;
import java.util.*;


public class Main {
	// LEVEL 3
	public static void main(String[] args) throws IOException {
	Locale.setDefault(Locale.US);
	double interval = 0;
	Scanner enter = new Scanner(System.in);
	interval = enter.nextDouble();
	
	if(interval <= 25 && interval >= 0) {
		
		System.out.println("Intervalo [0,25]");
	}else if(interval > 25 && interval <= 50) {
		
		System.out.println("Intervalo (25,50]");
	}else if(interval > 50 && interval <= 75) {
		
		System.out.println("Intervalo (50,75]");
	}else if( interval > 75 && interval <= 100) {
		
		System.out.println("Intervalo (75,100]");
	}else {
		
		System.out.println("Fora de intervalo");
	}
	
	}

}
