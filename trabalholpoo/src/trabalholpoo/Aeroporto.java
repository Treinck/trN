package trabalholpoo;

public class Aeroporto {
	
	private String codAeroporto;
	private Endereco endereco;
	
	//metodo construtor do aeroporto
	public Aeroporto(String codAeroporto, Endereco endereco) {
		this.codAeroporto = codAeroporto;
		this.endereco = endereco;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Código: " + codAeroporto + " - Cidade: " + endereco.getCidade() + "]";
	}	
}