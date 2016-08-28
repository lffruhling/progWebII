package informacoesdastring;

import java.io.DataInputStream;

public class Teclado{

	public int lerInteiro(String msg){
		int valor = 0;
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}
		
		try{
			valor = Integer.valueOf(linha).intValue();
		}catch (Exception e){
			System.out.println ("Nao foi possível converter para um valor inteiro.");
		}
		return valor;
	}

	public float lerReal(String msg){
		float valor = 0;
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}

		try{
			valor = Float.valueOf(linha).floatValue();
		}catch (Exception e){
			System.out.println ("Nao foi possível converter para um valor Real.");
		}
		
		return valor;
	}

	public String lerString(String msg){
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		String linha="";

		try {
			linha = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}

		return linha;
	}
	
	public char lerChar(String msg){
		System.out.println(msg);
		DataInputStream Ent = new DataInputStream(System.in);
		
		String sEntrada = "";
		char cLinha = ' ' ;
		
		try {
			sEntrada = Ent.readLine();
		}
		catch (Exception erro){
			System.out.println ("Erro de Leitura");
		}
		
		try{
			cLinha = (char) sEntrada.charAt(0);
		}catch (Exception e){
			System.out.println ("Nao foi possível converter para um Caractere.");
		}
		
		
		return cLinha;
	}
}