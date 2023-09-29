package monolito;

public class Calibracao {
	
	private String nome;
	private int preco = 100;
	
	
	public Calibracao(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPreco() {
		return this.preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void valorCalibracao() {
		System.out.print(preco);
	}
}
