package monolito;

public class Medalha {
	
	private int mmr;
	private int mmrFinal;
	
	
	public Medalha(int mmr, int mmrFinal) {
		this.mmr = mmr;
		this.mmrFinal = mmrFinal
	}
	
	public int getMmr() {
		return this.mmr;
	}
	
	public void setMmr(int mmr) {
		this.mmr = mmr;
	}
	
	public int getMmrFinal() {
		return this.mmrFinal;
	}
	
	public void setMmrFinal(int mmrFinal) {
		this.mmrFinal = mmrFinal;
	}
	
}
