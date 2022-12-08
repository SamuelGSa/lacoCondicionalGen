package atividadesParaEntregar;

import java.util.Scanner;

public class ex004 {

	// 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
	//e se é positivo ou negativo.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Impar ou Par?");
		System.out.println("==============");

		System.out.print("Digite um numero: ");
		int numero = entrada.nextInt();
		
		if (numero%2 == 0) System.out.println("O numero digitado " + numero + " é par!");
		
		else System.out.println("O numero digitado " + numero + " é impar!");
	}
}
