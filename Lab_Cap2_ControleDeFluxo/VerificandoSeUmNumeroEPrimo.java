package laborat�rios;

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
			// Dessa forma, caso seja inserido o n�mero 1 o c�digo informa que ele n�o � primo.
			System.out.println(divisoes==2?"O n�mero " + numero + " � primo":"O n�mero " + numero + " n�o � primo");
		} 
	}	

