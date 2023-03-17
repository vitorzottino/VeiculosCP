package br.com.fiap;

public class Executavel {

	public static void main(String[] args) {

		Carro A250 = new Carro("Mercedes-Benz", "A 250", "Automatico", 4, 1200, 300, 4, 210, 56, 50, 12);

		Motos F3800 = new Motos("Mercedes-Benz", "F3 800", "Automatico", 0, 173, 798, 2, 269, 17, 10, 6, true, "3 cilindros");

		Caminhao A2536 = new Caminhao("Mercedes-Benz", "AXOR 2536", "Automatico", 2, 9273, 360, 8, 120, 590, 100, 2.32, 20000, 20, true);

		A250.showSpecs();
		F3800.showSpecs();
		A2536.showSpecs();
		A250.throtle(10);
		

		// A250.turnOn();
		// A250.throtle(20);
		// A250.driveMode("sportMode");
		// A250.fillUp(50);

	}

}