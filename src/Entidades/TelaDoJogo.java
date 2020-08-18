package Entidades;

public class TelaDoJogo extends RegrasDoJogo{

  RegrasDoJogo regrasDoJogo;	
  
  public void mostrarNaTela() {
	  for (int i=0; i<regrasDoJogo.getNumeroDeLetras(); i++) {
			System.out.print(" _ ");
		}
  }
}
