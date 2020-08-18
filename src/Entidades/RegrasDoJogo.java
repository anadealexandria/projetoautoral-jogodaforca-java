package Entidades;

import java.io.Console;

public class RegrasDoJogo {

	private String palavra;
	private int numeroDeLetras;
	private String nomeDoJogador1;
	private String nomeDoJogador2;
	private int numeroDeTentivas;
	private String jogadorAtual;
    private int contador;

	public RegrasDoJogo() {

	}

	public RegrasDoJogo(String palavra, String nomeDoJogador1) {
		this.palavra = palavra;
		this.nomeDoJogador1 = nomeDoJogador1;
	}

	public String getPalavra() {
		return palavra;
	}

	public int getNumeroDeLetras() {
		return numeroDeLetras;
	}

	public String getNomeDoJogador1() {
		return nomeDoJogador1;
	}
	
	public void setNomeDoJogador1(String nomeDoJogador1) {
		this.nomeDoJogador1=nomeDoJogador1;
	}
	
	public void setNomeDoJogador2(String nomeDoJogador2) {
		this.nomeDoJogador2=nomeDoJogador2;
	}
	
	public void setNumeroDeLetras(int numeroDeLetras) {
		this.numeroDeLetras=numeroDeLetras;
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
	
	public String mostrarJogadorAtual() {
		if(getContador()%2 ==0 || getContador()==0) {
			return getNomeDoJogador2();
		}else {
			return getNomeDoJogador1();
		}
		
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return jogadorAtual;
	}
	
		
	public void obterAPalavra(char letras) {
		char [] caracteres = new char[getNumeroDeLetras()];
		for(int i=0; i<getNumeroDeLetras();i++) {
			caracteres [i] = letras;
		}
//		Console console = System.console();
//		caracteres=console.readPassword();
		
	}
	
	public void mostrarNaTela() {
		  for (int i=0; i<getNumeroDeLetras(); i++) {
				System.out.print(" _ ");
			}

}
}
