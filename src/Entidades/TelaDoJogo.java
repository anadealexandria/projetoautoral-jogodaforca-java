package Entidades;

import java.util.ArrayList;
import java.util.List;

public class TelaDoJogo {

	private int numeroDeTentativas;
	List<String> tracinhos = new ArrayList<>();

	public int getNumeroDeTentivas() {
		return numeroDeTentativas;
	}

	public void setNumeroDeTentivas(int numeroDeTentivas) {
		this.numeroDeTentativas = numeroDeTentivas;
	}

	public List<String> tracinhosNaTela(List<String> letras, String letra) {
		String traco = " _ ";
		String caractere = "";

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

	public String numeroDeTentativas(int i) {
		numeroDeTentativas = tracinhos.size() - i;

		return "Você tem " + numeroDeTentativas + " tentativas!";
	}
}
