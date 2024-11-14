package fundamentos;

import java.util.Scanner;

public class exemplo10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite numero 1:");
		int d1 = entrada.nextInt();
		System.out.println("Digite numero 2:");
		int d2 = entrada.nextInt();
		System.out.println("Digite numero 3:");
		int d3 = entrada.nextInt();
		if (d1>d2 && d1>d3) {
			System.out.println(d1+" é maior");
		}else if (d2>d1 && d2>d3) {
			System.out.println(d2+" é maior");
		}else {
			System.out.println(d3+" é maior");
		}

	}

}
