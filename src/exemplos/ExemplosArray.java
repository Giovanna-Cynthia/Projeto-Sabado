package exemplos;

import models.Aquario;
import models.Carro;

public class ExemplosArray {

	public static void main(String[] args) {

		int numero[] = new int[5];

		numero[0] = 32;
		numero[2] = 12;
		numero[4] = 1;

		System.out.println(numero[4]);

		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}

		// array aquario
		Aquario aquarios[] = new Aquario[5];

		Aquario aquario = new Aquario();
		aquario.setAgua(true);
		aquario.setLuz(true);
		if (aquario.isAgua()) {
			aquario.setPeixe(true);
		}

		aquarios[2] = aquario;

		Carro carro = new Carro();
		
		carro.setNome("Honda 1996 vtec aspirado turbo");

	}	
}
