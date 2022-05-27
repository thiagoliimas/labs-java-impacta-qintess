package laboratórios;

public class controleDeFluxo_lab2 {

	public static void main(String[] args) {
		
		String mes = "Fevereiro";
		
		String mes30 = mes + " tem 30 dias";
		String mes31 = mes + " tem 31 dias";
		
		String res = ""; // Essa variável receberá strings e tem o objetivo de evitar a repetição demasiada do "System.out.println();" no código.
		
		switch(mes) {
		
		case "Janeiro": case "Março": case "Maio": case "Julho": case "Agosto": case "Outubro": case "Dezembro":	
			res=mes31; break;
		
		case "Abril": case "Junho": case "Setembro": case "Novembro": 
			res=mes30; break;
			
		case "Fevereiro":
			res=mes + " tem 28 dias";break;
				
		default: System.out.println("Mês não encontrado");
				
		} System.out.println(res);
	}
}
