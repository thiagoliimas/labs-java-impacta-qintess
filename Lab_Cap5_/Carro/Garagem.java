package carro;

public class Garagem {
	
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();
	
	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		
		g.carroPasseio.modelo = "Polo";
		g.carroPasseio.cor = "Vermelho";
		g.carroPasseio.potencia = 1.0;
		
		g.carroUtilitario.modelo = "Doblô";
		g.carroUtilitario.cor = "Preta";
		g.carroUtilitario.potencia = 1.4;
		
		System.out.println("Carro de Passeio:");
		System.out.println("Modelo: " + g.carroPasseio.modelo);
		System.out.println("Cor: " + g.carroPasseio.cor);
		System.out.println("Potência do motor: " + g.carroPasseio.potencia);
		
		
		System.out.println("---------------------------------------");
		
		
		System.out.println("Carro de Utilitário:");
		System.out.println("Modelo: " + g.carroUtilitario.modelo);
		System.out.println("Cor: " + g.carroUtilitario.cor);
		System.out.println("Potência do motor: " + g.carroUtilitario.potencia);
		
	}
	

}
