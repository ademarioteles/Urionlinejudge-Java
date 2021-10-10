import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
  	Scanner scs =  new Scanner(System.in);
		
		int valor[] = new int[3];
		int maior = 0;
		for(int x = 0; x < 3; x++) {
			valor[x] = scs.nextInt();
			
			if(x == 0) {
				maior = valor[x];
		
	
			}else {
				
				if( valor[x] > maior) {
					maior = valor[x];
					
				}
				
			}
		}
		
		System.out.println(maior + " eh o maior");
 
    }
 
}
