package trabalholpoo;
import java.util.ArrayList;

public class Main{
	
	public static ArrayList<Endereco> endereco;
	
	public static void main(String[] args) {
		
		//cidades
		String cidade1 = "Teresina";
		String cidade2 = "Salvador";
		String cidade3 = "Campo Grande";
		String cidade4 = "Bonito";
		
		//enderecos completos
		Endereco endCompleto1 = new Endereco("Joaquim Murtinho", 380, "Jardim dos Estados", cidade1, "78070-190");
		Endereco endCompleto2 = new Endereco("Lupercio de Miranda", 16, "Moreninha", cidade2, "29690-178");
		Endereco endCompleto3 = new Endereco("Padre Joao Cripa", 32, "Portal Caioba", cidade3, "58010-761");
		Endereco endCompleto4 = new Endereco("Jose Alencar", 791, "Paranaiba", cidade4, "98123-050");
		
		//enderecos apenas cidade
		Endereco endAero1 = new Endereco(cidade1);
		Endereco endAero2 = new Endereco(cidade2);
		Endereco endAero3 = new Endereco(cidade3);
		Endereco endAero4 = new Endereco(cidade4);
		
		//passageiros
		Passageiro pass1 = new Passageiro("Juliana", "123.456.789-10", "2.524.774", endCompleto1, "99628-5001", "08/11/1967", "XV351349");
		Passageiro pass2 = new Passageiro("Matheus", "063.863.970-02", "6.504.785", endCompleto1, "98569-4251", "04/01/1981", "EB860570");
		Passageiro pass3 = new Passageiro("Alberto", "036.357.620-75", "8.915.905", endCompleto2, "96978-7246", "26/08/1957", "ZR362045");
		Passageiro pass4 = new Passageiro("Renan", "113.497.320-95", "5.068.254", endCompleto2, "99690-3234", "30/08/1958", "YF357756");
		Passageiro pass5 = new Passageiro("Bartolomeu", "343.753.210-32", "0.893.022", endCompleto2, "99337-3137", "26/12/1974", "RT280654");
		Passageiro pass6 = new Passageiro("João", "865.543.987-54", "3.653.931", endCompleto3, "98763-5469", "10/05/1981", "RN650048");
		Passageiro pass7 = new Passageiro("Mirian", "651.341.654-78", "1.782.654", endCompleto3, "99802-1357", "10/02/1970", "VZ500752");
		Passageiro pass8 = new Passageiro("Roberto", "076.350.123-76", "2.356.790", endCompleto4, "99432-5412", "13/12/1970", "HL433331");
		Passageiro pass9 = new Passageiro("Maria", "123.670.432-12", "1.654.890", endCompleto4, "99101-4556", "03/03/1995", "KR032315");
		Passageiro pass10 = new Passageiro("Pedro", "123.764.908-10", "1.345.301", endCompleto4, "98701-5676", "07/11/1958", "FF574571--");
		
		//aeroportos
		Aeroporto aero1 = new Aeroporto("1089", endAero1);
		Aeroporto aero2 = new Aeroporto("4815", endAero2);
		Aeroporto aero3 = new Aeroporto("8263", endAero3);
		Aeroporto aero4 = new Aeroporto("6298", endAero4);
		
		//compAereas
		CompanhiaAerea comp1 = new CompanhiaAerea("81267-98", "Jujubas Air C.O");
		CompanhiaAerea comp2 = new CompanhiaAerea("43789-23", "Abraços Voadores S.A");
		CompanhiaAerea comp3 = new CompanhiaAerea("35741-71", "Cazinha dos Aviões LTDA");
		CompanhiaAerea comp4 = new CompanhiaAerea("02759-55", "Caramelo Voos");
		
		//voos
		Voo voo1 = new Voo("923-D", aero1, aero2, 10, new Calendar(23, 02, 2023, 4), new Calendar(23, 02, 2023, 8));
		Voo voo2 = new Voo("841-A", aero3, aero4, 10, new Calendar(15, 06, 2023, 8), new Calendar(15, 06, 2023, 9));
		Voo voo3 = new Voo("012-A", aero2, aero3, 10, new Calendar(10, 03, 2023, 10), new Calendar(10, 03, 2023, 12));
		Voo voo4 = new Voo("851-C", aero1, aero4, 10, new Calendar(07, 07, 2023, 7), new Calendar(07, 07, 2023, 17));
		Voo vooV5 = new Voo("621-B", aero4, aero1, 10, new Calendar(27, 05, 2023, 10), new Calendar(28, 05, 2023, 10));
		Voo vooV6 = new Voo("475-B", aero3, aero2, 10, new Calendar(01, 05, 2023, 5), new Calendar(31, 05, 2023, 22));
		
		//passagens
		Passagem passagem1 = new Passagem("200-93", voo3, vooV6, pass1, "07B");
		Passagem passagem2 = new Passagem("200-94", voo3, vooV6, pass2, "07A");
		Passagem passagem3 = new Passagem("331-45", voo4, vooV5, pass3, "15D");
		Passagem passagem4 = new Passagem("331-46", voo4, vooV5, pass4, "15E");
		Passagem passagem5 = new Passagem("331-47", voo4, vooV5, pass5, "15F");
		Passagem passagem6 = new Passagem("690-01", voo1, pass6, "16B");
		Passagem passagem7 = new Passagem("690-02", voo1, pass7, "16A");
		Passagem passagem8 = new Passagem("872-12", voo2, pass8, "05D");
		Passagem passagem9 = new Passagem("872-13", voo2, pass9, "05E");
		Passagem passagem10 = new Passagem("872-14", voo2, pass10, "05F");

		//lista das passagens
		ArrayList<Passagem> arr1 = new ArrayList<Passagem>();
		arr1.add(passagem1);
		arr1.add(passagem2);
		ArrayList<Passagem> arr2 = new ArrayList<Passagem>();
		arr2.add(passagem3);
		arr2.add(passagem4);
		arr2.add(passagem5);
		ArrayList<Passagem> arr3 = new ArrayList<Passagem>();
		arr3.add(passagem6);
		arr3.add(passagem7);
		ArrayList<Passagem> arr4 = new ArrayList<Passagem>();
		arr4.add(passagem8);
		arr4.add(passagem9);
		arr4.add(passagem10);

		//bilhetes
		Bilhete<Integer> bilhete1 = new Bilhete<Integer>(1, 50.00, comp1, arr1);
		Bilhete<Integer> bilhete2 = new Bilhete<Integer>(2, 25.00, comp2, arr2);
		Bilhete<Integer> bilhete3 = new Bilhete<Integer>(3, 180.00, comp3, arr3);
		Bilhete<Integer> bilhete4 = new Bilhete<Integer>(4, 4000.00, comp4, arr4);
		
		//imprimir bilhetes
		System.out.println(bilhete1 + "\n\n\n");
		System.out.println(bilhete2 + "\n\n\n");
		System.out.println(bilhete3 + "\n\n\n");
		System.out.println(bilhete4 + "\n\n\n");
	}
	public boolean Validar(String codigo) {
			return false;
	}

	public void SolicitarNovo() {
	}
}

//      |