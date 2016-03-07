package br.unipe.mlpiii.locadora.modelo;

public class FitaInfantil extends Fita {

	public FitaInfantil(double preco, String titulo, Categoria categoria, Autor autor) {
		super(preco * 0.6, titulo, categoria, autor);
	}

}
