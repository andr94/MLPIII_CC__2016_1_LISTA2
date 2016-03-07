package br.unipe.mlpiii.locveiculo.ui;

import java.util.Scanner;

import br.unipe.mlpiii.locveiculo.modelo.Pessoa;
import br.unipe.mlpiii.locveiculo.modelo.Veiculo;
import br.unipe.mlpiii.locveiculo.modelo.VeiculoCarga;
import br.unipe.mlpiii.locveiculo.modelo.VeiculoPasseio;

public class Principal {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		System.out.printf("1 - Veiculo passeio\n2 - Veiculo carga\n->");
		
		int i = scan.nextInt();
		
		Pessoa proprietario;
		Veiculo veiculo ;
		String placa;
		String marca;
		String modelo;
		String ano;
		String chassi;
		String nome;
		int kmRodado;
		int kmInicial;
		int kmFinal;
		int carga;
		int portas;
		double valorLocacao;
		
		System.out.println("Informe placa:");
		placa = scan1.nextLine();
		System.out.println("Informe marca:");
		marca = scan1.nextLine();
		System.out.println("Informe modelo:");
		modelo = scan1.nextLine();
		System.out.println("Informe ano:");
		ano = scan1.nextLine();
		System.out.println("Informe chassi:");
		chassi = scan1.nextLine();
		System.out.println("Informe kmRodado:");
		kmRodado = scan.nextInt();
		System.out.println("Informe kmFinal:");
		kmFinal = scan.nextInt();
		System.out.println("Informe kmInicial:");
		kmInicial = scan.nextInt();
		System.out.println("Informe proprietario:");
		nome = scan1.nextLine();
		proprietario = new Pessoa(nome);
		valorLocacao = (kmFinal - kmInicial)*kmRodado;proprietario = new Pessoa(nome);
		if (i == 1){
			System.out.println("Informe numero de portas");
			portas = scan.nextInt();valorLocacao = (kmFinal - kmInicial)*kmRodado;proprietario = new Pessoa(nome);
			veiculo = new VeiculoPasseio(placa, marca, modelo, chassi, ano, kmRodado, kmInicial, kmFinal,
					portas, valorLocacao, proprietario);
		}
		else {
			System.out.println("Informe carga maxima:");
			carga = scan.nextInt();
			veiculo = new VeiculoCarga(placa, marca, modelo, chassi, ano, kmRodado, kmInicial, kmFinal,
					valorLocacao, carga, proprietario);
		}
		System.out.println("Valor Locacao: R$" + veiculo.getValorLocacao());
		
	}
}
