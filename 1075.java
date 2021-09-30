import java.io.IOException;
import java.util.*;


public class Main{
	
	public static void main(String[] args) throws IOException {

		Scanner entre = new Scanner(System.in);
	int z = entre.nextInt();
		
	for(int x = 1; x <10000; x++) {
		
		if(x % z == 2) {
			
			System.out.println(x);
		}
	}
	
	}
}