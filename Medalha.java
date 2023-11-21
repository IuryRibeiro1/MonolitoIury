package monolito;

public class Medalha {
	
	private String nome;
	private Long mmrInicial;
	private Long mmrFinal;
	
	
	
	public Medalha() {
		
	}
	
	
	public Medalha(String nome, Long mmrInicial, Long mmrFinal) throws Exception {
		this.nome = nome;
		this.mmrInicial = mmrInicial;
		this.mmrFinal = mmrFinal;
		
		
		if(mmrInicial > mmrFinal) {
			throw new Exception("O mmr Inicial não pode ser maior que o mmr Final");
		}
		
	}
	
	
	
	public Medalha(String nome) {
		this.nome = nome;
		
	}

	public Long getMmrInicial() {
		return this.mmrInicial;
	}
	
	public void setMmrInicial(Long mmrInicial) {
		this.mmrInicial = mmrInicial;
	}
	public Long getMmrFinal() {
		return this.mmrFinal;
	}
	
	public void setMmrFinal(Long mmrFinal) {
		this.mmrFinal = mmrFinal;
	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Medalha [nome=" + nome + ", mmrInicial=" + mmrInicial + ", mmrFinal=" + mmrFinal + "]";
	}

}

