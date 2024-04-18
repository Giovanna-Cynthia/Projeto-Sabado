package models;

public class Carro extends Veiculo implements SuperPoderes{

	private double tamanhoPorMalas;
	
	@Override
	public void voar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando carro");
	}

	public double getTamanhoPorMalas() {
		return tamanhoPorMalas;
	}

	public void setTamanhoPorMalas(double tamanhoPorMalas) {
		this.tamanhoPorMalas = tamanhoPorMalas;
	}
}
