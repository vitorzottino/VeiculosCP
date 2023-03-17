package br.com.fiap;

public class Executavel 
{

	public static void main(String[] args) 
	{

		// Ordem construtor de carros (Marca, Modelo, Transmissao, Portas, Peso, HP, Rodas, VelMax, Tanque, NivelTanque, Consumo)
		Carro A250 = new Carro("Mercedes-Benz", "A 250", "Automatic", 4, 1200, 300, 4, 210, 56, 6, 12);

		Motos R1250 = new Motos("BMW", "R 1250 GS", "Automatico", 0, 249, 136, 2, 300, 30, 10, 17.6, true);
		
		Caminhao FH540 = new Caminhao("Volvo", "FH 540", "Automatico", 2, 9.320, 540, 8, 276, 495, 100, 16, 74, 40, true);
		Caminhao FH5402 = new Caminhao("Volvo", "FH 540", "Automatico", 2, 9.320, 540, 8, 276, 495, 0, 16, 74, 40, false); //caminhao de teste sem carreta

		//A250.showSpecs();

		//R1250.showSpecs();
		
		//FH5402.showSpecs();
		 
		//Trecho que abastece o carro antes de ligar.
		//FH5402.fillUp(50);
		
		//FH5402.throtle(200);
		
		//FH540.unloading(34);
		
		
		A250.turnOn();
		A250.throtle(20);
		A250.fillUp(50);
		A250.driveMode("economyMode");

		
		
		
		

	}

}