package atividadesParaEntregar;

import java.util.Scanner;

public class ex003 {

	// 3) Desenvolva um sistema em que:
	// Leia 4 (quatro) números;
	// Calcule o quadrado de cada um;
	// Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e
	// finalize;
	// Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("======================");
		System.out.println("Calculadora de Quadrados");
		System.out.println("======================");

		System.out.print("Digite o primeiro numero: ");
		int num1 = entrada.nextInt();

		System.out.print("Digite o segundo número: ");
		int num2 = entrada.nextInt();

		System.out.print("Digite o terceiro número: ");
		int num3 = entrada.nextInt();

		System.out.print("Digite o quarto número: ");
		int num4 = entrada.nextInt();

		if (Math.pow(num3, 2) >= 1000) {
			System.out.println("O terceiro numero ao quadrado é: " + Math.pow(num3, 2));
		} else {
			System.out.println("O primeiro numero lido foi o n°: " + num1 + "e ao quadrado é: " + Math.pow(num1, 2));
			System.out.println("O segundo numero lido foi o n°: " + num2 + "e ao quadrado é: " + Math.pow(num2, 2));
			System.out.println("O terceiro numero lido foi o n°: " + num3 + "e ao quadrado é: " + Math.pow(num3, 2));
			System.out.println("O quarto numero lido foi o n°: " + num4 + "e ao quadrado é: " + Math.pow(num4, 2));

		}
	}

}
