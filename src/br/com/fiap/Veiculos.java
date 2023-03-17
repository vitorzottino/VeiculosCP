package br.com.fiap;

public abstract class Veiculos {

	protected int wheels, hp, doorsNum, topSpeed, gasTank, fuel, kmh, brk, acel;

	protected double weight, consumo;
	protected String brand, model, transmission;
	protected boolean isOn = false;

	public Veiculos(String brand, String model, String transmission, int doorsNum, double weight, int hp, int wheels,
			int topSpeed, int gasTank, int fuel, double consumo) {

		this.brand = brand;
		this.model = model;
		this.wheels = wheels;
		this.weight = weight;
		this.transmission = transmission;
		this.hp = hp;
		this.doorsNum = doorsNum;
		this.topSpeed = topSpeed;
		this.gasTank = gasTank;
		this.fuel = fuel;
		this.consumo = consumo;

	}

	public boolean verify() {

		if (this.fuel >= 1) {
			System.out.println(this.model + " OK para ligar");
			return true;
		}

		System.out.println("\n" + this.model + " precisa ser abastecido para ligar");
		System.exit(0);
		return false;
	}

	public void turnOn() {
		if (this.verify()) {
			System.out.println(this.model + " ligado");
			this.isOn = true;

		} else {
			verify();
			this.isOn = false;
		}

	}

	public boolean turnOff() {
		if (this.isOn) {
			System.out.println("\n" + this.model + " Desligado");
			return true;
		}
		System.out.println("\n" + this.model + " ja estava desligado");
		return false;

	}

	public void fillUp(int value) {
		if (this.fuel + value <= this.gasTank) {
			this.fuel += value;
			System.out.println("Abastecido");
		} else
			System.out.println("Tanque ja esta cheio");
	}

	public int throtle(int acel) {

		if (this.isOn) {
			if (this.fuel >= acel / this.consumo) {

				this.kmh += acel;
				this.fuel -= (acel / this.consumo);
				System.out.println("\nAcelerou: " + acel + " Velocidade atual: " + this.kmh + "km/h");
				System.out.println("Gasolina restante: " + this.fuel + "%");
				System.out.print("Gasolina gasta: ");
				System.out.printf("%.2f", (acel / consumo));
				this.acel = acel;
				return this.kmh;
			} else
				System.out.println("Gasolina Insuficiente");

		}

		else {
			System.out.println("\nLigue o veiculo antes de acelerar.");
			turnOn();
			throtle(acel);
		}
		return kmh;
	}

	public void brakes(int brk) {
		if (this.isOn) {
			this.kmh -= brk;
			System.out.println("Freiou: " + brk + " Velocidade atual: " + this.kmh);
		} else {
			System.out.println("Ligue o veiculo antes de frear.");
			turnOn();
			brakes(brk);

		}

	}

	public abstract void showSpecs();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDoorsNum() {
		return doorsNum;
	}

	public void setNumPortas(int doorsNum) {
		this.doorsNum = doorsNum;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;

	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getGasTank() {
		return gasTank;
	}

	public void setGasTank(int gasTank) {
		this.gasTank = gasTank;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public int getAcel() {
		return acel;
	}

	public void setAcel(int acel) {
		this.acel = acel;
	}

}
