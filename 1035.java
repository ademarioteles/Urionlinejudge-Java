import java.io.IOException;
import java.util.*;

public class Main {
 //LEVEL 2
    public static void main(String[] args) throws IOException {
    	int A,B,C,D;
    	
    	Scanner entrada = new Scanner(System.in);
    	A= entrada.nextInt();
    	B= entrada.nextInt();
    	C= entrada.nextInt();
    	D= entrada.nextInt();
    	
    	if(B > C && D > A && D + C > A + B && C > 0 && D > 0 && A % 2 == 0) {
    		
    		
    		System.out.println("Valores aceitos");
    	}else {
    		
    		System.out.println("Valores nao aceitos");
    	}
   
    }
 
}
