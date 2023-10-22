package monolito;

public class Usuario {
	
	private long id;
	private String nome;
	private String email;
	private String cpf;
	private String endereco;
	private String cep;
	
	
	
	public Usuario() {
		
	}
	
	public Usuario(long id, String nome, String email, String cpf, String endereco, String cep) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cep = cep;

	
	
	}

	public long getId(){
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String imprimir() {
		return "Nome:" + this.nome;
	}
	
}