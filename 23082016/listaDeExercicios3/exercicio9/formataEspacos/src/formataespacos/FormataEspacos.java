/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formataespacos;

/**
 *
 * @author Leonardo
 */
public class FormataEspacos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Faça um programa que, a partir de um texto digitado pelo usuário, 
        imprima o texto removendo todos os espaços em branco adicionais encontrados, 
        de modo que haja, no máximo, um espaço em branco separando as palavras presentes 
        nesse texto.*/
        
        Teclado t = new Teclado();
        String entrada;
        
        entrada = t.lerString("Informe uma frase: ");
        
        String recorta = entrada.trim();
	while (recorta.contains("  ")) {
		recorta = recorta.replaceAll("  ", " ");
	}
        
        System.out.println(recorta);
    }
    
}
