package introducaoJava;

import java.util.Scanner;

public class ex001 {

	// 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	// dias e mostre-a expressa apenas em dias.
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Anos de Vida: ");
		int ano = entrada.nextInt();

		System.out.println("Mes de Nascimento: ");
		int mes = entrada.nextInt();

		System.out.println("Dia de Nascimento: ");
		int dia = entrada.nextInt();

		int somaDias = (((mes * 31) + dia + (ano * 365)));

		System.out.println("Sua idade em dias é: " + somaDias);
	}
}
