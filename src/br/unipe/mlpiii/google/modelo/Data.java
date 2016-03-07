package br.unipe.mlpiii.google.modelo;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public boolean valida(int dia, int mes, int ano) {
		if (dia > 31 || dia < 1)
			return false;
		if (mes > 12 || mes < 1)
			return false;
		if (ano < 1)
			return false;
		return true;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return this.mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return this.ano;
	}

}
