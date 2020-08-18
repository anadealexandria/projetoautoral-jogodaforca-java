package Execucoes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.RegrasDoJogo;
import Entidades.TelaDoJogo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		TelaDoJogo jogo = new TelaDoJogo();
		RegrasDoJogo jogada1 = new RegrasDoJogo();
		int contador=0;
		int contadorDeLetras=0;
		
		
		//Nome do jogador 1
		TelaDoJogo tela = new TelaDoJogo();
		System.out.println("Nome do Jogador 1: ");
		String j1 = entrada.nextLine();
		jogada1.setNomeDoJogador1(j1);
		
		//Nome do jogador 2
		System.out.println("Nome do Jogador 2: ");
		String j2 = entrada.nextLine();
		jogada1.setNomeDoJogador2(j2);
		
	
		//Como entrar no la�o?
		while(contador >=0) {
			
		//Aqui eu tenho de trocar o jogador no final do la�o, ou melhor, trocar o jogador alternando-o para cada jogada
		System.out.printf("Jogador(a) %s, digite a palavra: ", jogada1.mostrarJogadorAtual());
		
		//Guardando a palavra digitada numa lista
		String palavra = entrada.nextLine();
		String palavraArray [] = palavra.split(""); 
		List <String> letras = new ArrayList<>();
		for(String letra: palavraArray) {
			letras.add(letra);	
			contadorDeLetras ++;
		}
		
		//Limpando a tela e mostrando os tracinhos referentes a palavra 
		tela.limpaConsole();
		jogo.setNumeroDeLetras(contadorDeLetras);
		System.out.println();
		jogo.tracinhosNaTela();
		
		//Pedindo para o jogador oponente digitar a letra
		System.out.println();
		System.out.println();
		System.out.printf("Jogador(a) %s, digite uma letra: ", jogada1.mostrarJogadorOponente());
		String letra = entrada.nextLine();
		
		
		//Verificando se a letra corresponde a alguma letra da palavra
		int soma =contador +=1;
		jogada1.setContador(soma);
		
		}
			
		}
	

}


