package introducaoJava;

import java.util.Scanner;

public class ex004 {

	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	//e calcule a seguinte expressão: 
	//D= R+S/2
	// Onde R = (A+B)² S = (B+C)²
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double numeroA = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		double numeroB = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		double numeroC = entrada.nextInt();
		
		double calculo = (Math.pow(numeroA+numeroB,2)) + (Math.pow(numeroB+numeroC,2)) /2;
		
		System.out.println("O calculo da expressão D = R + S / 2 = " + calculo);
		
	}
}
