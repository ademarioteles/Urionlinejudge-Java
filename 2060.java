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
 
    
		Scanner N  = new Scanner(System.in);
	int md = 0;
	int mt = 0;
	int mq = 0;
	int mc = 0;
		int x = N.nextInt();
		int z;
	for(int w = 0; w<x; w++) {
		
		z =  N.nextInt();
		if(z % 2 == 0) {
			
			md++;
			
		} if(z % 3 == 0) {
			
			mt++;
		} if(z % 4 == 0) {
			
			mq++;
		}if(z % 5 == 0) {
			
			mc++;
		}
		
		
	}
	System.out.println(md + " Multiplo(s) de 2");
	System.out.println(mt + " Multiplo(s) de 3");
	System.out.println(mq + " Multiplo(s) de 4");
	System.out.println(mc + " Multiplo(s) de 5");
	
    }
 
}