package monolito;

public class Medalha {
	
	private int mmrInicial;
	private int mmrFinal;
	private double preco;
	
	
	public Medalha(int mmrInicial, int mmrFinal, double preco) {
		this.mmrInicial = mmrInicial;
		this.mmrFinal = mmrFinal;
		this.preco = preco;
	}
	
	public int getMmrInicial() {
		return this.mmrInicial;
	}
	
	public void setMmr(int mmrInicial) {
		this.mmrInicial = mmrInicial;
	}
	public int getMmrFinal() {
		return this.mmrFinal;
	}
	
	public void setMmrFinal(int mmrFinal) {
		this.mmrFinal = mmrFinal;
	
	}
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
