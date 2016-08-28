/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totaldepalavras;

/**
 *
 * @author Leonardo
 */
public class TotalDePalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Faça um programa que, a partir de um texto digitado pelo usuário, 
        conte o número de caracteres total e o número de palavras (palavra 
        é definida por qualquer sequência de caracteres delimitada por espaços 
        em branco) e exiba o resultado.*/
        
        Teclado t = new Teclado();
        String entrada, recorta;
        int totalPalavras = 0;
        
        entrada = t.lerString("Informe uma frase: ");
        
        System.out.println("Total de caracteres da frase: " + entrada.length());
        
        String[] palavras = entrada.split(" ");
        
        System.out.println("Total de palavras: " + palavras.length);
    }
    
}
