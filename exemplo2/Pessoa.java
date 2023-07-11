public class Pessoa {
	
	private int rg;
	private String nome;
	private int salario;
	
	public void setRg(int rg){
		this.rg = rg;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSalario(int salario) throws SalarioException{//posso disparar uma exceção SalarioException
		int salarioMinimo = 1320;
		if(salario >= salarioMinimo){
			this.salario = salario;
		}
		else {
			throw new SalarioException(); //Dispara excecao quando salario < salarioMinimo
		}
	}
	
	public int getRg(){
		return rg;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getSalario(){
		return salario;
	}
}