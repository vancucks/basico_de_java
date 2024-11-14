package fundamentos;

import java.util.Scanner;

public class exemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("masculino ou feminino (F para feminino, M para masculino)");
		char n1 = entrada.next().charAt(0);
		if (n1 == 'F') {
			System.out.println("você escolheu o feminino");
		}else if (n1 == 'M') {
			System.out.println("você escolheu o masculino");
		}else {
			System.out.println("erro");
		}
	}

}
