package introducaoJava;

import java.util.Scanner;

public class ex005 {

	//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = entrada.nextInt();
		

		double calculo = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 3;

		
		System.out.println("A média das 3 notas é: " + calculo);
		
	}
}
