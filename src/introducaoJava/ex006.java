package introducaoJava;

import java.util.Scanner;

public class ex006 {

	//6. Construa um programa em JAVA que, tendo como dados de entrada dois pontos quaisquer no plano, 
	//P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de x1: ");
		int x1 = entrada.nextInt();
		System.out.println("Digite o valor de x2: ");
		int x2 = entrada.nextInt();
		
		System.out.println("Digite o valor de y1: ");
		int y1 = entrada.nextInt();
		System.out.println("Digite o valor de y2: ");
		int y2 = entrada.nextInt();
		

		double calculo = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

		
		
		System.out.println("A distância entre eles é: " + calculo);
		
	}
}
