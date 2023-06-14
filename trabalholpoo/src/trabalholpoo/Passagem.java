package trabalholpoo;

public class Passagem implements Comparable<Object> {
	
	private Voo VooIda;
	private Voo VooVolta;
	private String assento;
	private String num;
	private Passageiro passageiro;

	//metodo construtor sem voo volta
	public Passagem(String num, Voo VooIda, Passageiro passageiro, String assento) {
		this.num = num;
		this.VooIda = VooIda;
		this.passageiro = passageiro;
		this.assento = assento;
	}
	
	//metodo construtor com voo volta
	public Passagem(String num, Voo VooIda, Voo VooVolta, Passageiro passageiro, String assento) {
		this.num = num;
		this.VooIda = VooIda;
		this.passageiro = passageiro;
		this.assento = assento;
		this.VooVolta = VooVolta;
	}
	
	//metodo para verificar se o voo tem capacidade
	public boolean verificarCapacidade(Voo voo) {
		if(voo.getCapacidade() == 0) {
			System.out.println("Voo sem disponibilidade");
			return false;
		}
		return true;
	}

	//metodo toString formatado para os 2 construtores
	public String toString() {
		if (VooVolta == null) {
			return "\nPassagem Nmrº: " + num + "\nVoo de Ida:" + VooIda + "\nVoo de Volta: Não Existente" +
		    "\nPassageiro:" + passageiro + " // Assento: " + assento + "\n";
		}
		else {
			return "\nPassagem Nmrº: " + num + "\nVoo de Ida:" + VooIda + "\nVoo de Volta:" + VooVolta + "\nPassageiro:" +
			passageiro + " // Assento: "+ assento + "\n";
		}
	}

	//metodo compareTo
	public int compareTo(Object obj) {
		return passageiro.getNome().compareTo(((Passageiro)obj).getNome());
	}
}