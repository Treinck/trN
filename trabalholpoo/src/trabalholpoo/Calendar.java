package trabalholpoo;

public class Calendar {
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	
	//metodo construtor do calendario
	public Calendar(int dia, int mes, int ano, int hora) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
	}

	//metodo toString
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano + " - Horário Local: " + hora + ":00";
	}	
}