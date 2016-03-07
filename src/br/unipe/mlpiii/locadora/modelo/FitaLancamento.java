package br.unipe.mlpiii.locadora.modelo;

public class FitaLancamento extends Fita {

	public FitaLancamento(double preco, String titulo, Categoria categoria, Autor autor) {
		super(preco * 1.2, titulo, categoria, autor);
	}

}
