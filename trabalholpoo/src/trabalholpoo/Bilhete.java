package trabalholpoo;

import java.util.ArrayList;

public class Bilhete<T> {

	private T numBilhete;
	private ArrayList <Passagem> listPassagem;
	private double preco;
	private CompanhiaAerea compAerea;
	
	//metodo construtor do bilhete
	public Bilhete(T numBilhete, double preco, CompanhiaAerea compAerea, ArrayList<Passagem> p){
		this.numBilhete = numBilhete;
		this.preco = preco;
		this.compAerea = compAerea;
		this.listPassagem = p;
	}
	
	//metodo toString formatado
	@Override
	public String toString() {
		return String.format("Bilhete número: " + numBilhete + "\nLista de Passagens: \n" +
		listPassagem.toString().replace("[", "").replace("]", "").replace(",", "") + "\nPreço do Bilhete: R$%.2f" +
		"\nCompanhia Aérea Responsável: " + compAerea, preco);
	}
}