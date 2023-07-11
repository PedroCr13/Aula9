import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura { 

	//uso do Trows indica que o metodo está delegando o tratamento da exceção
	public static String inData(String label)throws IOException{
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		System.out.print(label);
		String s = "";	
		//try{
			s = cd.readLine();
		//}
		//catch(IOException e){
		//	System.out.println("Erro de entrada");
		//}
		return s;
	}
}