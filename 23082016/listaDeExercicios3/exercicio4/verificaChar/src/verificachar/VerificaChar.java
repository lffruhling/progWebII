/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificachar;

/**
 *
 * @author Leonardo
 */
public class VerificaChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        4. Faça um programa em Java para verificar se um vetor com elementos do tipo char é
        palíndromo ou não.
        */
        
        char vetor[] = {'a', 'b', 'c', 'y', 'c', 'b', 'a'};
        //char vetor[] = {'a', 'b', 'c', 'y', 'c', 'b', 'd'};
        boolean palindromo = true;
        int esquerda = 0, direita = vetor.length - 1;
        
        while(palindromo && esquerda < direita){
            if (vetor[esquerda] == vetor[direita]){
                esquerda++;
                direita--;
            }else{
                palindromo = false;
            }
        }
        
        if(palindromo){
            System.out.println("Vetor é palindromo");
        }else{
            System.out.println("Vetor não é palindromo");
        }
    }
    
}
