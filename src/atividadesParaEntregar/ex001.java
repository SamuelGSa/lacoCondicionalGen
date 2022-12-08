package atividadesParaEntregar;

import java.util.Scanner;

public class ex001 {

	//1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
	//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
	//(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
	
	//João precisa que você faça um sistema que leia a variável P (peso de tomates) 
	//e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa 
	//que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
	
	public static void main(String[] args) {
		System.out.println("=====================================");
		System.out.println("Calculadora de Imposto sobre Tomates");
		System.out.println("======================================");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual é o rendimento diário de tomates? (Em quilos): ");
		float tomates = entrada.nextInt();
		
		if (tomates > 50) {
			
			double excesso = tomates - 50.00;
			
			double multa = excesso * 4.00;
		
			System.out.println("Você excedeu o limite diário de 50kg, passando " + excesso + " kg. Você pagará: R$ " + multa);
		} else{
			System.out.println("Você não excedeu o limite diário de 50kg e não pagará multas. ");

		}
		
		
	}

}
