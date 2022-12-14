package introducaoJava;

import java.util.Scanner;

public class ex007 {

	//7. Um sistema de equações lineares do tipo: 
	//ax + by = c
	//dx + ey = f
	//pode ser resolvido segundo mostrado abaixo : 
	//x = ce - bf / ae - bd
	//y = af - cd / ae - bd
	
	//Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
	//e calcula e mostra os valores de x e y. 

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva o valor de A: ");
		int numA = entrada.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		int numB = entrada.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		int numC = entrada.nextInt();
		
		System.out.println("Escreva o valor de D: ");
		int numD = entrada.nextInt();
		
		System.out.println("Escreva o valor de E: ");
		int numE = entrada.nextInt();
		
		System.out.println("Escreva o valor de F: ");
		int numF = entrada.nextInt();
		
		int x = (numC*numE)-(numB*numF) / (numA*numE)-(numB*numD);
		int y = (numA*numF)-(numC*numD) / (numA*numE)-(numB*numD);

	
		
		System.out.println("O valor de X: " + x + " e o valor de Y: " + y);
		
	}
}
