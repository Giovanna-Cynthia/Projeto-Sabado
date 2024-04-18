package models;

public class Aquario {

	private boolean peixe;
	private boolean agua;
	private boolean luz;

	private int qtdFuncionario;
	private int qtdPeixe;

	public boolean isAgua() {
		return agua;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public boolean isLuz() {
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}

	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}

	public int getQtdPeixe() {
		return qtdPeixe;
	}

	public void setQtdPeixe(int qtdPeixe) {
		this.qtdPeixe = qtdPeixe;
	}

	public boolean getPeixe() {
		return this.peixe;
	}

	public void setPeixe(boolean peixe) {
		this.peixe = peixe;
	}

}
