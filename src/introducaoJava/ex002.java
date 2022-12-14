package introducaoJava;

import java.util.Scanner;

public class ex002 {

	//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	//expressa em anos, meses e dias.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Anos de Vida em Dias: ");
		int diasDeVida = entrada.nextInt();
		
		int anos = diasDeVida/365;
		int mes = diasDeVida%365/31;
		int dias = diasDeVida%365%31;
		
		System.out.println("Você tem " + anos +" anos, " + mes + " meses e, " + dias +" dias de vida.");

	}
}
