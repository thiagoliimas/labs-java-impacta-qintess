package laboratórios;

	public class controleDeFluxo_lab1 {
		public static void main(String[] args) {
			
			int numero, divisoes;
			
			numero = 197;
			
			divisoes = 0;
			
			for(int i = 1; i <= numero; i++) {
				
				if(numero % i == 0) {
					divisoes++;
				}
			} 
			// Dessa forma, caso seja inserido o número 1 o código informa que ele não é primo.
			System.out.println(divisoes==2?"O número " + numero + " é primo":"O número " + numero + " não é primo");
		} 
	}	

