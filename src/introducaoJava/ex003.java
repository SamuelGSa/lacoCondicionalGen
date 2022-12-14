package introducaoJava;

import java.util.Scanner;

public class ex003 {

	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa 
	//em segundos e mostre-o expresso em horas, minutos e segundos. 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o tempo de duração do Evento em segundos: ");
		int tempoEmSegundos = entrada.nextInt();
		
		int horas = tempoEmSegundos/60;
		int minutos = tempoEmSegundos%60;
		
		System.out.println("O evento tem a duração de: " + horas + " horas, "+ minutos +
				" minutos.");
	}
}