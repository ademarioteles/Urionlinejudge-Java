import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	Locale.setDefault(Locale.US);

	    int tempo, velocidadem;
	    
        Scanner sc = new Scanner(System.in);
        
        tempo = sc.nextInt();
        velocidadem = sc.nextInt();
        double quantidade = (velocidadem * tempo ) / 12.0;
        
        System.out.printf("%.3f\n", quantidade );
        
 
    }
 
}
