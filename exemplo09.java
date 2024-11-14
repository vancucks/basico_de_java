package fundamentos;

import java.util.Scanner;

public class exemplo09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int d1 = entrada.nextInt();
		if (d1>0) {
		System.out.println("ele é positivo");
		}else {
			System.out.println("ele é negativo");
		}
	}

}
