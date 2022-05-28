package cap5lab1;

public class Funcionario {
	
	private String nome;
	private String sobrenome; 
	private String cargo;
	private double salario;
	
	public void setNome (String nomeFunc) {
		nome = nomeFunc;
	}
	
	public void setSobrenome (String sobrenomeFunc) {
		sobrenome = sobrenomeFunc;
	}
	
	public void setCargo (String cargoFunc) {
		cargo = cargoFunc;
	}
	
	public void setSalario (double salarioFunc) {
		salario = salarioFunc;
	}
	
	public String getNome () {
		return nome;
	}
	
	public String getSobrenome () {
		return sobrenome;
	}
	
	public String getCargo () {
		return cargo;
	}
	
	public double getSalario () {
		return salario;
	}
}
