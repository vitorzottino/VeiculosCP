package br.com.fiap;

public class Motos extends Veiculos {

	boolean cowling;
	String cilinder;

	public Motos(String brand, String model, String transmission, int doorsNum, double weight, int hp, int wheels,
			int topSpeed, int gasTank, int fuel, double consumo, boolean cowling, String cilinder) {
		super(brand, model, transmission, doorsNum, weight, hp, wheels, topSpeed, gasTank, fuel, consumo);
		this.cowling = cowling;
		this.cilinder = cilinder;
	}

	public String containCowling() {
		if (this.cowling) {
			return "Possui carenagem";
		}
		return "Não possui carenagem";
	}

	@Override
	public void showSpecs() {
		System.out.println("\n----------------------");
		System.out.print("MARCA: " + this.getBrand());
		System.out.print("\nMODELO: " + this.getModel());
		System.out.print("\nPeso: " + this.weight + " KG");
		System.out.print("\nTipo do motor: " + this.cilinder);
		System.out.print("\nTransmissao: " + this.getTransmission());
		System.out.print("\nCilindradas: " + this.getHp() + "cc");
		System.out.print("\nVelocidade Maxima: " + this.getTopSpeed() + " KM/h");
		System.out.print("\n" + containCowling());
		System.out.print("\nCapacidade do tanque: " + this.getGasTank() + " litros");
		System.out.print("\nKM/L: " + this.getConsumo());

	}

}
