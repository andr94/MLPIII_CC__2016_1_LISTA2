package br.unipe.mlpiii.locadora.ui;

import java.util.Scanner;

import br.unipe.mlpiii.locadora.modelo.Autor;
import br.unipe.mlpiii.locadora.modelo.Categoria;
import br.unipe.mlpiii.locadora.modelo.Fita;
import br.unipe.mlpiii.locadora.modelo.FitaInfantil;
import br.unipe.mlpiii.locadora.modelo.FitaLancamento;

public class Principal {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

		System.out.printf("1 - Fita Lancamento\n2 - Fita Infantil\n->");
		int i = scan.nextInt();

		if (i == 1) {
			System.out.println("Informe titulo:");
			String titulo = scan1.nextLine();
			System.out.printf("Informe a categoria:\n1 - Acao\n2 - Aventura\n3 - Suspence\n4 - Terror\n5 - Comedia\n-> ");
			int j = scan.nextInt();
			Categoria categoria = null;
			if (j == 1) {
				categoria = categoria.Acao;
			} else if (j == 2) {
				categoria = categoria.Aventura;
			} else if (j == 3) {
				categoria = categoria.Suspence;
			} else if (j == 4) {
				categoria = categoria.Terror;
			} else if (j == 5) {
				categoria = categoria.Comedia;
			}
			System.out.println("Informe autor: ");
			String nautor = scan1.nextLine();
			Autor autor = new Autor(nautor);
			Fita lancamento = new FitaLancamento(5, titulo, categoria, autor);
			System.out.println(lancamento);
		} else if (i == 2) {
			System.out.println("Informe titulo:");
			String titulo = scan1.nextLine();
			System.out.printf("Informe a categoria:\n1 - Aventura\n2 - Comedia\n-> ");
			int j = scan.nextInt();
			Categoria categoria = null;
			if (j == 1) {
				categoria = categoria.Aventura;
			} else if (j == 2) {
				categoria = categoria.Comedia;
			}
			System.out.println("Informe autor:");
			String nautor = scan1.nextLine();
			Autor autor = new Autor(nautor);
			Fita infantil = new FitaInfantil(5, titulo, categoria, autor);
			System.out.println(infantil);
		}
		scan.close();
		scan1.close();
	}
}
