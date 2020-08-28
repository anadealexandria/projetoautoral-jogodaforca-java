package Entidades;

import java.util.List;

public class RegrasDoJogo {

	private TelaDoJogo telaDoJogo;

	private int contador;
	private String nomeDoJogador1;
	private String nomeDoJogador2;
	private String jogadorAtual;

	public RegrasDoJogo() {
		this.telaDoJogo = new TelaDoJogo();
	}

	public TelaDoJogo getTelaDoJogo() {
		return telaDoJogo;
	}

	public void setTelaDoJogo(TelaDoJogo telaDoJogo) {
		this.telaDoJogo = telaDoJogo;
	}

	public String getNomeDoJogador1() {
		return nomeDoJogador1;
	}

	public void setNomeDoJogador1(String nomeDoJogador1) {
		this.nomeDoJogador1 = nomeDoJogador1;
	}

	public void setNomeDoJogador2(String nomeDoJogador2) {
		this.nomeDoJogador2 = nomeDoJogador2;
	}

	public String getNomeDoJogador2() {
		return nomeDoJogador2;
	}

	public String getJogadorAtual() {
		return jogadorAtual;
	}

	public void setJogadorAtual(String jogadorAtual) {
		this.jogadorAtual = jogadorAtual;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String mostrarJogadorAtual() {
		if (getContador() % 2 == 0 || getContador() == 0) {
			return getNomeDoJogador1();
		} else {
			return getNomeDoJogador2();
		}

	}

	public String mostrarJogadorOponente() {
		if (getContador() % 2 == 0 || getContador() == 0) {
			return getNomeDoJogador2();
		} else {
			return getNomeDoJogador1();
		}
	}

	public boolean letraCorrespondente(List<String> letras, String letra) {

		boolean verificador = false;
		for (int i = 0; i < letras.size(); i++) {
			String caractere = letras.get(i);
			if (caractere.equals(letra)) {
				verificador = true;
				break;
			}
		}
		if (verificador) {
			telaDoJogo.tracinhosNaTela(letras, letra);
			return true;

		} else {
			System.out.println("Não existe essa letra na palavra! ");
			return false;

		}

	}

	public boolean verificaçãoDeListaPreenchida(List<String> letras) {

		if (letras.equals(telaDoJogo.tracinhos)) {
			return true;

		} else {
			return false;
		}

	}

	public String verificacaoDaVitoria(List<String> letras) {

		if (letras.equals(telaDoJogo.tracinhos)) {
			return "Você ganhou! Parabéns!";
		} else {
			return "Quem sabe não se sai melhor na outra rodada! Não desanime!";
		}

	}

	public void limpandoPalavra(List<String> letras) {

		for (int i = 0; i < letras.size(); i++) {

			telaDoJogo.tracinhos.remove(letras.get(i));
		}
	}

}
