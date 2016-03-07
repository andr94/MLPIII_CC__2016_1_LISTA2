package br.unipe.mlpiii.google.ui;

import java.util.Scanner;

import br.unipe.mlpiii.google.modelo.Data;

public class Principal {
	public static void main(String[] agrs) {

		Scanner scan = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Informe dia: ");
		dia = scan.nextInt();
		System.out.println("Informe mes: ");
		mes = scan.nextInt();
		System.out.println("Informe ano");
		ano = scan.nextInt();

		Data data = new Data(dia, mes, ano);

		if (!data.valida(data.getDia(), data.getMes(), data.getAno())) {
			System.out.println("Informacoes invalidas digite novamente");
			do {
				System.out.println("Informe dia: ");
				dia = scan.nextInt();
				data.setDia(dia);
				System.out.println("Informe mes: ");
				mes = scan.nextInt();
				data.setMes(mes);
				System.out.println("Informe ano");
				ano = scan.nextInt();
				data.setAno(ano);
				if (!data.valida(data.getDia(), data.getMes(), data.getAno()))
					System.out.println("Informacoes invalidas digite novamente");
			} while (!data.valida(data.getDia(), data.getMes(), data.getAno()));
		}
		scan.close();
		System.out.println(data);
	}

}
