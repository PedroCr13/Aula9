import java.io.IOException;

public class Inicio {
	public static void main(String args[]){
		Leitura l = new Leitura();
		Pessoa pes = new Pessoa();
		try{
			//operacoes que usam metodo inData() estao dentro do try pois podem disparar excecao
			//na assinatura do metodo inData() está definido throws, que delega a quem usá-lo deve tratar a excecao.
			pes.setRg(Integer.parseInt(l.inData("\nEntre com o RG <deve ser numero> ")));
			pes.setNome(l.inData("\nEntre com o nome: "));
		}catch(IOException e){ //excecao IOException que o metodo inData pode disparar esta sendo tratado aqui
			System.out.println("\n Erro de entrada");
		}
		System.out.println("\n ID....: " + pes.getRg());
		System.out.println("\n Nome..: " + pes.getNome());
	}
}