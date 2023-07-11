public class Inicio {
	
	public static void main(String args[]){
		Pessoa p = new Pessoa();
		Leitura l = new Leitura();
		
		p.setRg(Integer.parseInt(l.inData("\nEntre com o RG: ")));
		p.setNome(l.inData("\nEntre com o Nome: "));
		try{
			p.setSalario(Integer.parseInt(l.inData("\nEntre com o salario: ")));
		}catch(SalarioException se){
			System.out.println("\nQual erro aconteceu?");
			se.impErro();
		}
		System.out.println("\nRG " + p.getRg());
		System.out.println("\nNome " + p.getNome());
		System.out.println("\nSalario " + p.getSalario());
	}
}