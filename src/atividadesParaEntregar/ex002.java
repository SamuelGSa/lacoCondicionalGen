package atividadesParaEntregar;

import java.util.Scanner;

public class ex002 {

	//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	//E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	//Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
	//caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	//No final do processamento imprimir o salário total e o salário excedente.
	
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		System.out.println("======================");
		System.out.println("Calculadora de Hora Extra");
		System.out.println("======================");
		
		System.out.print("Código do operário: ");
		float codigo = entrada.nextInt();
		
		System.out.print("Quantidade de horas trabalhadas: ");
		int nHorasTrabalhadas = entrada.nextInt();
		double salario = nHorasTrabalhadas * 10.00;

		if (nHorasTrabalhadas > 50) {
			double excesso = (nHorasTrabalhadas - 50)* 20.00;
			
			System.out.println("O Seu salário é de: R$ " + salario + " e você receberá: R$ " + excesso + " referente às horas extras");
			
		} else {
			
			System.out.println("O seu salário é de: R$" + salario);
		}
	}

}
