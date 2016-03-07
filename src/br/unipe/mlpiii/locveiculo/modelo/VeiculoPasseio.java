package br.unipe.mlpiii.locveiculo.modelo;

public class VeiculoPasseio extends Veiculo {

	private int numeroPortas;
	
	public VeiculoPasseio(String placa, String marca, String modelo, String chassi, String ano, 
			int valorKmRodado, int kmInicial, int kmFinal, int numeroPortas, double valorLocacao, Pessoa proprietario) {
		super(placa, marca, modelo, chassi, ano, valorKmRodado, 
				kmInicial, kmFinal, valorLocacao, proprietario);
		this.numeroPortas = numeroPortas;
		
	}

}
