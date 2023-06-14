package trabalholpoo;

public class Passageiro extends Pessoa {
	
	private String numPassaporte;
	
	//metodo construtor do passageiro
	public Passageiro(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNasc, String numPassaporte) {
		super(nome, cpf, rg, endereco, celular, dataNasc);
		this.numPassaporte = numPassaporte;
	}

	//metodo toString com super para pessoa
	@Override
	public String toString() {
		return super.toString() + "Passaporte Nmrº: " + numPassaporte;
	}
	
	public boolean Validar(String codigo) {
		return false;
	}

	public void SolicitarNovo() {
		
	}
}