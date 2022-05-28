package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario();
		
		fun1.nome = "Thiago";
		fun1.sobrenome = "Lima";
		fun1.cargo = "Programador";
		fun1.salario = 4000;
		
		System.out.println("Nome: " + fun1.nome);
		System.out.println("Sobrenome: " + fun1.sobrenome);
		System.out.println("Cargo: " + fun1.cargo);
		System.out.println("Salário: R$ " + fun1.salario);

	}

}
