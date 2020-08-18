package Entidades;



public class TelaDoJogo extends RegrasDoJogo{

  RegrasDoJogo regrasDoJogo;	
  private int numeroDeLetras;
  
  
  public int getNumeroDeLetras() {
		return numeroDeLetras;
	}
  
  public void setNumeroDeLetras(int numeroDeLetras) {
		this.numeroDeLetras=numeroDeLetras;
	}
  
  public void tracinhosNaTela() {
	  for (int i=0; i<getNumeroDeLetras(); i++) {
			System.out.print(" _ ");
		}
  }
  
  public void limpaConsole() {
	  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
  }
}
