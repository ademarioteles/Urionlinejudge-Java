import java.io.IOException;
import java.util.*;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	int an;
		int me;
		int di;
		int value;
		Scanner entrada = new Scanner(System.in);
		value = entrada.nextInt();
		if (value < 365) {

			an = 0;
			me = (value / 30) ;
			di = (value % 360 % 30) / 1;

		} else {

			an = value / 365;
			me = (value % 365) / 30;
			di = (value % 365 % 30) / 1;

		}

		System.out.println(an + " ano(s)");
		System.out.println(me + " mes(es)");
		System.out.println(di + " dia(s)");

    }
 
}
