package Entidades;



public class RegrasDoJogo {

	private String palavra;

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

	public String mostrarJogadorAtual() {
		if (getContador() % 2 == 0 || getContador() == 0) {
			return getNomeDoJogador1();
		} else {
			return getNomeDoJogador2();
		}
	
	}
	
	public String mostrarJogadorOponente() {
		if(getContador() % 2 == 0 || getContador()==0) {
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

}
