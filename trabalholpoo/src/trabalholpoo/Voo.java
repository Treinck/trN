package trabalholpoo;

public class Voo {
	
	private String numVoo;
	private Aeroporto aeroOrigem, aeroDestino;
	private int capacidade;
	private Calendar calendarioO;
	private Calendar calendarioD;
	
	//metodo construtor do voo
	public Voo(String numVoo, Aeroporto aeroportoOrigem, Aeroporto aeroportoDestino,
				int capacidade, Calendar calendarioO, Calendar calendarioD){
		this.numVoo = numVoo;
		this.aeroOrigem = aeroportoOrigem;
		this.aeroDestino = aeroportoDestino;
		this.capacidade = capacidade;
		this.calendarioO = calendarioO;
		this.calendarioD = calendarioD;
	}
	
	//metodo get para pegar a capacidade
	public int getCapacidade() {
		return this.capacidade;
	}

	//metodo toString
	@Override
	public String toString() {
        return " Nmrº: " + numVoo + " // Aeroporto de Origem: " + aeroOrigem + " // Aeroporto de Destino: " +
        aeroDestino + " // Calendário de Ida: " + calendarioO + " / Calendário de Chegada: " + calendarioD +
        " // Capacidade: " + capacidade + " Pessoas";
    }
}