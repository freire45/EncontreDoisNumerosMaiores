package br.com.erickfreire.encontredoisnumerosmaiores;

import java.util.Scanner;

/**
 * Programa em Java que localiza os dois maiores números
 * @author Erick Freire
 * @version 1 - Criado em 09-04-2021 as 18:02
 */

public class EncontreDoisNumerosMaiores {
	public static void main(String[] args) {
		int contador = 1;
		int numero = 0;
		int maior = 0;
		int maior2 = 0;
		int aux = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(contador <= 10) {
			System.out.print("Digite um número inteiro: ");
			numero = entrada.nextInt();
			
			if(numero > maior) {
				aux = maior;
				maior2 = aux;
				maior = numero;
			}
			
			if(numero < maior) {
				if(numero > maior2) {
					maior2 = numero;
				}
			}
			
			contador++;
		}
		
		System.out.printf("%n%nO maior valor é: %d%n"
				        + "O segundo maior é: %d%n", maior, maior2);
		
		
		
	
	}

}
