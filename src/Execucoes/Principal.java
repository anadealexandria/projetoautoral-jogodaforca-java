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
		String letra="";
		int contador = 0;
		

		// Nome do jogador 1
		TelaDoJogo tela = new TelaDoJogo();
		System.out.println("Nome do Jogador 1: ");
		String j1 = entrada.nextLine();
		jogada1.setNomeDoJogador1(j1);

		// Nome do jogador 2
		System.out.println("Nome do Jogador 2: ");
		String j2 = entrada.nextLine();
		jogada1.setNomeDoJogador2(j2);

		// Como entrar no laço?
		while (contador >= 0) {

			// Aqui eu tenho de trocar o jogador no final do laço, ou melhor, trocar o
			// jogador alternando-o para cada jogada
			System.out.printf("Jogador(a) %s, digite a palavra: ", jogada1.mostrarJogadorAtual());

			// Guardando a palavra digitada numa lista
			String palavra = entrada.nextLine();
			String palavraArray[] = palavra.split("");
			List<String> letras = new ArrayList<>();
			for (String caractere : palavraArray) {
				letras.add(caractere);
				
			}
			

			// Limpando a tela e mostrando os tracinhos referentes a palavra
			tela.limpaConsole();
			//jogo.setNumeroDeLetras(contadorDeLetras);
			System.out.println();
			System.out.println(jogo.tracinhosNaTela(letras, letra));

			// Pedindo para o jogador oponente digitar a letra
			System.out.println();
			System.out.println();
			
			for(int i=0 ; i<palavraArray.length+2 ; i++) {
			System.out.printf("Jogador(a) %s, digite uma letra: ", jogada1.mostrarJogadorOponente());
			letra = entrada.nextLine();
			//jogada1.setLetra(letra);

			// Verificando se a letra corresponde a alguma letra da palavra contida na lista
			System.out.println(jogo.tracinhosNaTela(letras, letra));
			}
			
			int soma = contador += 1;
			jogada1.setContador(soma);

			// Tenho que remover os elementos da lista ao final do while fazer um método
			// para isso, pois,
			// caso não faça isso, os tracinhos se somam
			
			// Na verdade, o que mantém os tracinhos é o contadorDeLetras, mas é preciso remover 
			// o que está presente na lista para que possa-se comparar com o que o usuário digita
			// por isso a necessidade de se criar o método remover
			
			
		}
	}

}
