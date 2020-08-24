package Entidades;

import java.util.ArrayList;
import java.util.List;

public class TelaDoJogo extends RegrasDoJogo {

	RegrasDoJogo regrasDoJogo;
	private int numeroDeLetras;
	List<String> tracinhos = new ArrayList<>();

	public int getNumeroDeLetras() {
		return numeroDeLetras;
	}

	public void setNumeroDeLetras(int numeroDeLetras) {
		this.numeroDeLetras = numeroDeLetras;
	}

	public List<String> tracinhosNaTela(List<String> letras, String letra) {
		String traco = " _ ";
		String caractere="";
		if (tracinhos.isEmpty()) {
			for (int i = 0; i < letras.size(); i++) {
				tracinhos.add(traco);
			}
		}

		for (int i = 0; i < letras.size(); i++) {

			caractere = letras.get(i);
			if (caractere.equals(letra)) {
				traco = traco.replace(traco, letra);
				tracinhos.set(i, letra);

			}

		}	
		

		return tracinhos;
	}

	public void limpaConsole() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
