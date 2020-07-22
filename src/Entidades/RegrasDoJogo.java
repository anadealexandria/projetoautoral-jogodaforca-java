package Entidades;

public class RegrasDoJogo {

	private String palavra;
	private int numeroDeLetras;
	private String nomeDoJogador1;
	private String nomeDoJogador2;
	private int numeroDeTentivas;
	private String jogadorAtual;


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
	
	public void setNomeDoJogador2(String nomeDoJogador1) {
		this.nomeDoJogador1=nomeDoJogador2;
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
	
	public String mostrarJogadorAtual(String jogadorAtual) {		
		this.jogadorAtual=jogadorAtual;
		return toString();
	}
	
	@Override
	public String toString() {
		return jogadorAtual;
	}

}
