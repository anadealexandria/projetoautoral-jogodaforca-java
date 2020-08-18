package Execucoes;

import java.io.Console;
import java.util.Scanner;

import Entidades.RegrasDoJogo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		RegrasDoJogo jogo = new RegrasDoJogo();
		int contador=0;
		
		//Nome do jogador 1
		RegrasDoJogo jogada1 = new RegrasDoJogo();
		System.out.println("Nome do Jogador 1: ");
		String j1 = entrada.nextLine();
		jogada1.setNomeDoJogador1(j1);
		
		//Nome do jogador 2
		System.out.println("Nome do Jogador 2: ");
		String j2 = entrada.nextLine();
		jogada1.setNomeDoJogador2(j2);
		
	
		//Como entrar no laço?
		while(contador >=0) {
		//Aqui eu tenho de trocar o jogador no final do laço, ou melhor, trocar o jogador alternando-o
		System.out.printf("Jogador(a) %s, digite a palavra: ", jogada1.mostrarJogadorAtual());
		int soma =contador +=1;
		jogada1.setContador(soma);
		System.out.println(jogada1.getContador());
		}
			
			System.out.println();
			jogada1.mostrarNaTela();
		}
	

}


