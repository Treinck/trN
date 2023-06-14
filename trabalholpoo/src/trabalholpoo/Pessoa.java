package trabalholpoo;

public abstract class Pessoa implements Verificavel {
	
	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private String celular;
	private String dataNascimento;
	
	//metodo construtor de pessoa
	public Pessoa(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNasc){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.celular = celular;
		this.dataNascimento = dataNasc;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return " " + nome + " // CPF: " + cpf + " - RG: " + rg + " - Data de Nascimento: " + dataNascimento
		+ " // Endereço: " + endereco + " // Celular: " + celular + " // ";
	}

	//metodo get para pegar o nome 
	public String getNome() {
		return nome;
	}
}