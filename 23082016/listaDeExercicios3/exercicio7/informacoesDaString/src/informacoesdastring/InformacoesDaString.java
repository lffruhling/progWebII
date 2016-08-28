/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacoesdastring;

/**
 *
 * @author Leonardo
 */
public class InformacoesDaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        7. Escreva um programa em Java que leia uma String informada pelo usuário. O programa deve mostrar na tela:
            a. O número de caracteres da string;
            b. A string com todas as suas letras em maiúsculo;
            c. O número de vogais da string;
            d. O número de números (0 a 9) na string;
            e. Se a string é um palíndromo ou não.
        */
        Teclado t = new Teclado();
        String entrada, entradaAux, recorta;
        
        //String vogais = "aeiou";
        String numeros = "0123456789";
        int totalVogais = 0, totalNumeros = 0;
        boolean palindroma = false;
        
        entrada = t.lerString("Informe uma frase: ");
        
        System.out.println("O número de caracteres da: " + entrada.length());
        System.out.println("Todas as suas letras em maiúsculo: " + entrada.toUpperCase());
        
        for (int i = 0; i < entrada.length(); i++){
            recorta = entrada.substring(i, i + 1).toLowerCase(); 
            if( recorta.equals("a") || 
                recorta.equals("e") || 
                recorta.equals("i") || 
                recorta.equals("o") || 
                recorta.equals("u")){
                totalVogais++;
            }
            if( recorta.equals("0") ||
                recorta.equals("1") ||
                recorta.equals("2") ||
                recorta.equals("3") ||
                recorta.equals("4") ||
                recorta.equals("5") ||
                recorta.equals("6") ||
                recorta.equals("7") ||
                recorta.equals("8") ||
                recorta.equals("9")){
                totalNumeros++;
            }
        }
        
        System.out.println("Total de vogais: " + totalVogais);
        
        System.out.println("Total de numeros: " + totalNumeros);
        entradaAux = entrada.toLowerCase();
        entradaAux = entradaAux.replaceAll(" ", "");
        palindroma = entradaAux.equals(new StringBuilder(entradaAux).reverse().toString());
        if(palindroma){
            System.out.println("A frase é palindroma");
        }else{
            System.out.println("A frase não é palindroma");
        }
    }
    
}
