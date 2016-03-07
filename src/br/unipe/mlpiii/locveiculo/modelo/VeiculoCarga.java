package br.unipe.mlpiii.locveiculo.modelo;

public class VeiculoCarga extends Veiculo {
	
	private int capacidadeCarga;
	
	public VeiculoCarga(String placa, String marca, String modelo, String chassi, String ano, int valorKmRodado,
			int kmInicial, int kmFinal, double valorLocacao, int capacidadeCarga, Pessoa proprietario) {
		super(placa, marca, modelo, chassi, ano, valorKmRodado, 
				kmInicial, kmFinal, valorLocacao, proprietario);
		this.capacidadeCarga = capacidadeCarga;
	}

}
