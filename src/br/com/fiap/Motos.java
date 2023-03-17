package br.com.fiap;

public class Motos extends Veiculos 
{

	boolean cowling;
	public Motos(String brand, String model, String transmission, int doorsNum, double weight, int hp, int wheels, int topSpeed, int gasTank, int fuel, double consumo, boolean cowling) 
	{
		super(brand, model, transmission, doorsNum, weight, hp, wheels, topSpeed, gasTank, fuel, consumo);
		this.cowling = cowling;	
	}
	   
	//Método Carenagem 
	public String containCowling(boolean cowling)
	{
		if(this.cowling)
		{
			return "Possui carenagem";
		}
			return "Não possui carenagem";
	}

	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub
		
	}

}
