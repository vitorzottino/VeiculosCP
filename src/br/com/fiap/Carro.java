package br.com.fiap;

public final class Carro extends Veiculos {

	private static final String sportMode = "sportMode";
	private static final String economyMode = "economyMode";

	public Carro(String brand, String model, String transmission, int doorsNum, double weight, int hp, int wheels,
			int topSpeed, int gasTank, int fuel, double consumo) {
		super(brand, model, transmission, doorsNum, weight, hp, wheels, topSpeed, gasTank, fuel, consumo);
	}

	@Override
	public void showSpecs() {
		System.out.println("----------------------");
		System.out.print("MARCA: " + this.getBrand());
		System.out.print("\nMODELO: " + this.getModel());
		System.out.print("\nPortas: " + this.getDoorsNum());
		System.out.print("\nPeso: " + this.weight + " KG");
		System.out.print("\nTransmissao: " + this.getTransmission());
		System.out.print("\nVelocidade Maxima: " + this.getTopSpeed() + " KM/h");
		System.out.print("\nPotencia do motor: " + this.getHp());
		System.out.print("\nCapacidade do tanque: " + this.getGasTank() + " litros.");
		System.out.print("\nKM/L: " + this.getConsumo());

	}

	public void driveMode(String mode) {

		if (this.isOn) {
			switch (mode) {
			case sportMode:
				System.out.println("\n---------------------");
				System.out.println("\nSportMode Ativo!");
				this.kmh += (acel * 3.5);
				this.consumo = consumo / 4.5;
				this.fuel -= (acel / this.consumo);
				System.out.println("Acelerou: " + acel + " Velocidade atual: " + this.kmh + "km/h");
				System.out.println("Gasolina: " + this.fuel);
				System.out.print("Gasolina gasta: ");
				System.out.printf("%.2f", (acel / consumo), "");

				break;

			case economyMode:
				System.out.println("\n---------------------");
				System.out.println("\nEconomyMode Ativo!\n");
				this.kmh += (acel * 0.9);
				this.consumo = consumo * 2;
				this.fuel -= (acel / this.consumo);
				System.out.println("Acelerou: " + acel + " Velocidade atual: " + this.kmh + "km/h");
				System.out.println("Gasolina: " + this.fuel + "%");
				System.out.print("Gasolina gasta: ");
				System.out.printf("%.2f", (acel / consumo));

				break;

			default:
				System.out.println("Modo nao encontrado.");
			}
		} else {
			System.out.println("Você precisa ligar o carro antes.");
			turnOn();
		}

	}

	public static String getSportmode() {
		return sportMode;
	}

	public static String getEconomymode() {
		return economyMode;
	}

}
