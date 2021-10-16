import java.io.IOException;
import java.util.*;
 
//PECA PERDIDA 2322
public class Main {
 
    public static void main(String[] args) throws IOException {
 
   int v = 0;
		int menor = 0, maior = 0;
		Scanner c = new Scanner(System.in);
		v = c.nextInt();
		int w[] = new int[v];
		
		if (v >= 2 && v <= 1000) {
			for (int x = 1; x < v; x++) {
				w[x] = c.nextInt();
				if (x == 1) {

					menor = w[x];
					maior = w[x];

				} else if(x > 1) {

					if (menor > w[x]) {

						menor = w[x];
						
					} else if (w[x] > maior) {

						maior = w[x];

					}

				}

			}
		
			int soma = 0, soma1= 0;
			for(int z = 1; z <= maior; z++) {
				
	
				soma +=z;
				
			}
			
			for(int l = 1; l < v; l++) {
				
		
				soma1 += w[l]; 
				
			}

			if(soma - soma1 == 0) {
				
				maior++;
				System.out.println(maior);
			}else {
				System.out.println(soma - soma1);
				
			}
			
		
		} 

		
    }
 
}
