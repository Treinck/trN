package trabalholpoo;

public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	//construtor endereco completo
	public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	//construtor endereco menor
	public Endereco(String cidade) {
		this.cidade = cidade;
	}
	//metodo get para pegar a cidade do endereco menor
	public String getCidade() {
		return cidade;
	}
	//metodo toString
	@Override
	public String toString() {
		return "Rua: " + rua + " - Bairro: " + bairro + " - Nmrº: " + numero + " - Cidade: " + cidade +
		" - CEP: " + cep;
	}
}