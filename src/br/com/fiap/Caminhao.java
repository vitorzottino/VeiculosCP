package br.com.fiap;

public class Caminhao extends Veiculos {

	protected int load;
	protected int maxLoad;
	protected boolean trunk;

	public Caminhao(String brand, String model, String transmission, int doorsNum, double weight, int hp, int wheels,
			int topSpeed, int gasTank, int fuel, double consumo, int maxLoad, int load, boolean trunk) {
		super(brand, model, transmission, doorsNum, weight, hp, wheels, topSpeed, gasTank, fuel, consumo);
		this.maxLoad = maxLoad;
		this.load = load;
		this.trunk = trunk;

	}

	public String containTrunk() {
		if (this.trunk) {

			return "\nCaminhao com carga";
		}

		return "\nCaminhao sem carga";
	}

	public void loading(int carga) {
		if (this.trunk) {
			if (this.load + carga <= maxLoad) {
				this.load += carga;
				System.out.println("Carga inserida! Carga atual: " + this.load + "KG");
			} else {
				System.out.println("Nao foi possivel inserir carga, carreta lotada!");
			}
		} else {
			System.out.println("O caminhao " + this.model + " nao possui carreta");
		}
	}

	public void unloading(int carga) {
		if (this.trunk) {
			if (this.load == 0) {
				System.out.println("Nao possui carga");
			} else {
				this.load -= carga;
				System.out.println(this.model + " descarregado! Carga atual: " + this.load + "KG");
			}
		} else {
			System.out.println("O caminhao " + this.model + " nao possui carreta");
		}
	}

	@Override
	public void showSpecs() {
		System.out.println("\n----------------------");
		System.out.print("MARCA: " + this.getBrand());
		System.out.print("\nMODELO: " + this.getModel());
		System.out.print("\nPeso: " + this.weight + " KG");
		System.out.print("\nCapacidade da carreta: " + this.maxLoad);
		System.out.print("\nTransmissao: " + this.getTransmission());
		System.out.print("\nVelocidade Maxima: " + this.getTopSpeed() + " KM/h");
		System.out.print("\nPotencia do motor: " + this.getHp());
		System.out.print("\nCapacidade do tanque: " + this.getGasTank() + " litros");
		System.out.print("\nKM/L: " + this.getConsumo());
		System.out.println(containTrunk());

	}

}
