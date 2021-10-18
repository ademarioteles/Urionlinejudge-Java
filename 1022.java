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
 
    
		int x = 0;
		int N1, N2, D1, D2;
		String equal;
		Scanner entrada = new Scanner(System.in);
		x = entrada.nextInt();
		if (x >= 1 && x <= 10000) {
			for (int z = 0; z < x; z++) {

				N1 = entrada.nextInt();

				if (entrada.next().compareTo("/") == 0) {

					D1 = entrada.nextInt();
					equal = entrada.next();
					if (equal.compareTo("+") == 0) {
						N2 = entrada.nextInt();
						if (entrada.next().compareTo("/") == 0) {
							D2 = entrada.nextInt();

							for (int w = 1000; w > 0; w--) {

								if ((N1 * D2 + N2 * D1) % w == 0 && (D1 * D2) % w == 0) {

									System.out.println((N1 * D2 + N2 * D1) + "/" + (D1 * D2) + " = "
											+ (N1 * D2 + N2 * D1) / w + "/" + (D1 * D2) / w);
									break;
								}

							}
						}

					} else if (equal.compareTo("-") == 0) {
						N2 = entrada.nextInt();
						if (entrada.next().compareTo("/") == 0) {
							D2 = entrada.nextInt();

							for (int w = 1000; w > 0; w--) {

								if ((N1 * D2 - N2 * D1) % w == 0 && (D1 * D2) % w == 0) {

									System.out.println((N1 * D2 - N2 * D1) + "/" + (D1 * D2) + " = "
											+ (N1 * D2 - N2 * D1) / w + "/" + (D1 * D2) / w);
									break;
								}

							}

						}

					} else if (equal.compareTo("*") == 0) {
						N2 = entrada.nextInt();
						if (entrada.next().compareTo("/") == 0) {
							D2 = entrada.nextInt();

							for (int w = 1000; w > 0; w--) {

								if ((N1 * N2) % w == 0 && (D1 * D2) % w == 0) {

									System.out.println(
											(N1 * N2) + "/" + (D1 * D2) + " = " + (N1 * N2) / w + "/" + (D1 * D2) / w);
									break;
								}

							}
						}
					} else if (equal.compareTo("/") == 0) {
						N2 = entrada.nextInt();
						if (entrada.next().compareTo("/") == 0) {
							D2 = entrada.nextInt();

							for (int w = 1000; w > 0; w--) {

								if ((N1 * D2) % w == 0 && (N2 * D1) % w == 0) {

									System.out.println(
											(N1 * D2) + "/" + (N2 * D1) + " = " + (N1 * D2) / w + "/" + (N2 * D1) / w);
									break;
								}

							}
						}
					}

				}
			}

		}
    }
 
}
