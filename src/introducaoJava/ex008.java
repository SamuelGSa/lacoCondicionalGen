package introducaoJava;

import java.util.Scanner;

public class ex008 {

	//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	//com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva o custo de Fábrica: ");
		double custoDeFabrica = entrada.nextInt();
		
		double porcentagemDoDistribuidor = (custoDeFabrica/100)*28;
		double impostos = (custoDeFabrica/100)*45;
		
		double soma = porcentagemDoDistribuidor + impostos + custoDeFabrica;
		
		System.out.println("custo do carro novo: "+ soma + " custo do Distribuidor: " + porcentagemDoDistribuidor + " Custo em impostos: " + impostos);
		
	}
}
