package Execucoes;

import java.util.Scanner;

import Entidades.RegrasDoJogo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		RegrasDoJogo jogada1 = new RegrasDoJogo();
		System.out.println("Nome do Jogador 1: ");
		String j1=entrada.nextLine();
		jogada1.setNomeDoJogador1(j1);
		
		System.out.println("Nome do Jogador 2: ");
		String j2=entrada.nextLine();
		jogada1.setNomeDoJogador2(j2);
		System.out.print("Jogador(a) " + jogada1.mostrarJogadorAtual(j1)+ ", digite uma palavra: "); 
		
		
	}

}
