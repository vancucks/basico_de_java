package fundamentos;

import java.util.Scanner;

public class exemplo12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("entre com a primeira nota:");
		double d1 = entrada.nextDouble();
		System.out.println("entre com a segunda nota:");
		double d2 = entrada.nextDouble();
		
		double media = (d1+d2)/2;
		
		System.out.println(media);

	}

}
