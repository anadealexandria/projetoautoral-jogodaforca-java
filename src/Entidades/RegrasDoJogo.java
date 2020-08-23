package Entidades;

import java.util.List;

public class RegrasDoJogo {

	TelaDoJogo telaDoJogo;
	private String palavra;
	private String letra;
	private String nomeDoJogador1;
	private String nomeDoJogador2;
	private int numeroDeTentivas;
	private String jogadorAtual;
	private int contador;

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public RegrasDoJogo() {

	}

	public RegrasDoJogo(String palavra, String nomeDoJogador1) {
		this.palavra = palavra;
		this.nomeDoJogador1 = nomeDoJogador1;
	}

	public String getPalavra() {
		return palavra;
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

	public int getNumeroDeTentivas() {
		return numeroDeTentivas;
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

	// Método para indicar se a letra na lista é uma letra correspondente ao que foi
	// digitado pelo usuário
	public String letraCorrespondente(List<String> letras, String letra) {
				
		for (int i=0 ; i<letras.size() ; i++) {
			String caractere = letras.get(i);
			if (caractere.equals(letra)) {
				return letra;

			}
		}

		return "Não existe essa letra! ";

	}	
}
