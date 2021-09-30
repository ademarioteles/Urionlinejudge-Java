import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
 	public static int rafael(int x, int y) {
		
		return ((3 * x) * (3 * x)) + (y * y);
	}
	public static int beto(int x, int y) {
		
		return 2 * (x * x) + ((5 * y ) * (5 * y ));
	}
	public static int carlos(int x, int y) {
		
		return -100 * x + (y * y * y);
	}
	
    public static void main(String[] args) throws IOException {
 
		int count;
		Scanner N = new Scanner(System.in);
		count = N.nextInt();
		for(int x = 0;x < count; x++) {
		int z = 0,w = 0;
		z = N.nextInt();
		w = N.nextInt();
			if(z >= 1 && w <= 100) {
			if(Main.rafael(z,w) > Main.beto(z,w) && Main.rafael(z,w) > Main.carlos(z,w) ) {
				
				System.out.println("Rafael ganhou");
				
			}else if(Main.beto(z,w) > Main.rafael(z,w) && Main.beto(z,w) > Main.carlos(z,w)) {
				
				System.out.println("Beto ganhou");
				
			}else if(Main.carlos(z,w) > Main.rafael(z,w) && Main.carlos(z,w) > Main.beto(z,w)) {
			
				System.out.println("Carlos ganhou");
				
			}
		
			}
		
	}