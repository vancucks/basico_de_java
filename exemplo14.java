package fundamentos;
import java.util.Scanner;
public class exemplo14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("responda so com 1 para sim e 0 para não");
		
		System.out.println("Telefonou para a vítima?");
		int d1 = entrada.nextInt();
		System.out.println("Esteve no local?");
		int d2 = entrada.nextInt();
		System.out.println("Mora perto da vítima?");
		int d3 = entrada.nextInt();
		System.out.println("Devia para a vítima?");
		int d4 = entrada.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		int d5 = entrada.nextInt();
		int soma = d1+d2+d3+d4+d5;
		if (soma == 2) {
			System.out.println("Suspeito");
		}else if (soma == 3 || soma == 4 ) {
			System.out.println("Cúmplice");
		}else if (soma == 5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
		
	}

}
