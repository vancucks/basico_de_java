package fundamentos;

import java.util.Scanner;

public class exemplo11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("entre com o numero da semana");
		int d1 = entrada.nextInt();
		
		if (d1==1) {
			System.out.println("Domingo");
		}else if (d1==2) {
			System.out.println("Segunda");
		}else if (d1==3) {
			System.out.println("Terça");
		}else if (d1==4) {
			System.out.println("Quarta");
		}else if (d1==5) {
			System.out.println("Quinta");
		}else if (d1==6) {
			System.out.println("Sexta");
		}else if (d1==7) {
			System.out.println("Sabado");
		}else {
			System.out.println("valor inválido");
		}

	}

}
