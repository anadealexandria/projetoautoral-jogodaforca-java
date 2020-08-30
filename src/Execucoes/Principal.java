package Execucoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.RegrasDoJogo;
import Entidades.TelaDoJogo;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		RegrasDoJogo jogada1 = new RegrasDoJogo();
		String letra = "";
		int contador = 0;

		TelaDoJogo tela = new TelaDoJogo();
		System.out.println("Nome do Jogador 1: ");
		String j1 = entrada.nextLine();
		jogada1.setNomeDoJogador1(j1);

		System.out.println("Nome do Jogador 2: ");
		String j2 = entrada.nextLine();
		jogada1.setNomeDoJogador2(j2);

		while (contador >= 0) {

			System.out.printf("Jogador(a) %s, digite a palavra: ", jogada1.mostrarJogadorAtual());

			String palavra = entrada.nextLine().toLowerCase();
			String palavraArray[] = palavra.split("");
			List<String> letras = new ArrayList<>();
			for (String caractere : palavraArray) {
				letras.add(caractere);

			}

			tela.limpaConsole();

			System.out.println();
			System.out.println(jogada1.getTelaDoJogo().tracinhosNaTela(letras, letra));

			System.out.println();
			System.out.println();

			for (int i = 0; i < palavraArray.length + 2; i++) {
				System.out.printf("Jogador(a) %s, digite uma letra: ", jogada1.mostrarJogadorOponente());
				letra = entrada.nextLine().toLowerCase();
				
				jogada1.letraCorrespondente(letras, letra);

				System.out.println(jogada1.getTelaDoJogo().tracinhosNaTela(letras, letra));
				System.out.println();

				if (jogada1.verificaçãoDeListaPreenchida(letras)) {
					break;
				} else {
					System.out.println(jogada1.getTelaDoJogo().numeroDeTentativas(i));
					continue;
				}

			}
			System.out.println(jogada1.verificacaoDaVitoria(letras));

			jogada1.limpandoPalavra(letras);

			int soma = contador += 1;
			jogada1.setContador(soma);

		}
		entrada.close();
	}

}
