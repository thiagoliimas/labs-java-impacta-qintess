package laborat�rios;

public class controleDeFluxo_lab3 {

	public static void main(String[] args) {
		
		for(int ano = 1930; ano <= 2022; ano += 4) {
			
			if(ano == 1942 || ano == 1946) {
				continue;
			}
			System.out.println("Compa do mundo de " + ano);
		}
	}
}
