public class SalarioException extends Exception {
	public SalarioException(){
		System.out.println("\n Metodo Contrutor da Classe Salario Exception");
	}
	
	public void impErro(){
		System.out.println("\n Salario abaixo do valor");
	}
}