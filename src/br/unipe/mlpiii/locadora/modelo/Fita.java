package br.unipe.mlpiii.locadora.modelo;

public abstract class Fita {
	private double preco;
	private String titulo;
	private Categoria categoria;
	private Autor autor;

	public Fita(double preco, String titulo, Categoria categoria, Autor autor) {
		this.categoria = categoria;
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}
	public String toString(){
		return ("Titulo: " + getTitulo() + ". Categoria: " + getCategoria().toString() + ". Autor: "+ getAutor().getNome() + ". Preco: R$" + getPreco());
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
