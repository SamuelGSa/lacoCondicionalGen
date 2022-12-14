package lacoCondicional;

import java.util.Scanner;

public class ex005 {

	// 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são 
	//altamente poluentes do meio ambiente. 
	//O índice de poluição aceitável varia de 0,05 até 0,25. 
	//Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, 
	//se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
	//se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
	//Faça um sistema que leia o índice de poluição medido e emita a
	//notificação adequada aos diferentes grupos de empresas.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Controle dos Índices de poluição");
		System.out.println("==========================");

		System.out.println("Digite o índice de poluição: ");
		double poluicao = entrada.nextDouble();
		
		if(poluicao == 0.3) System.out.print("Indústrias do 1° grupo são intimadas a suspenderem suas ativides");
		else if(poluicao == 0.4)System.out.print("Indústrias do 1° e 2° grupo são intimadas a suspenderem suas ativides");
		else System.out.print("Todos os grupo são intimados a suspenderem suas ativides");
		
		
	}
}
