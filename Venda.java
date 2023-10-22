package monolito;

public class Venda {
	
	private long id;

	
	Medalha medalha = new Medalha();
	
	
	public Venda(long id) {
		this.id = id;
	
	
	}
	
	public long getId() {
		return this.id;
	}
	
	public long setId(long id) {
		return this.id = id;
	}
	
	
}
