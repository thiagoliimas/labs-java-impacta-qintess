package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		
		fun1.setNome("Thiago");
		fun1.setSobrenome("Lima");
		fun1.setCargo("Programador");
		fun1.setSalario(4000.0);
		
		System.out.println("Dados do funcionário:");
		System.out.println("Nome: " + fun1.getNome());
		System.out.println("Sobrenome: " + fun1.getSobrenome());
		System.out.println("Cargo: " + fun1.getCargo());
		System.out.println("Salário: R$ " + fun1.getSalario());
	}
}
