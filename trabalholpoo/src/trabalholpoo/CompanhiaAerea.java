package trabalholpoo;

public class CompanhiaAerea {
	
	private String codCompan;
	private String nomeCompan;
	
	//metodo construtor de compAerea
	public CompanhiaAerea(String codCompan, String nomeCompan) {
		this.codCompan = codCompan;
		this.nomeCompan = nomeCompan;
	}

	//metodo toString
	@Override
	public String toString() {
		return nomeCompan + " - Código: " + codCompan;
	}
}