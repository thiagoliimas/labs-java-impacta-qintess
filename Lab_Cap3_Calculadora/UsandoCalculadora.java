package Exemplo.Metodo;

public class UsandoCalculadora {

	public static void main(String[] args) {
			
			double somando, subtraindo, dividindo, multiplicando;
			
			Calculadora calc = new Calculadora();
			
			somando = calc.somar(11,13);
			subtraindo = calc.subtrair(11, 13);
			dividindo = calc.dividir(11, 13);
			multiplicando = calc.multiplicar(11, 13);
			
			System.out.println("Somando = " + somando);
			System.out.println("Subtraindo = " + subtraindo);
			System.out.println("Dividindo = " + dividindo);
			System.out.println("Multiplicando = " + multiplicando);
	}
}




