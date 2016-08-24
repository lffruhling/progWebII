/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculavetor;

import java.util.Random;

/**
 *
 * @author IF
 */
public class CalculaVetor {

    /**
     * @param args the command line arguments
     * 
     * 1. Escreva um programa em Java para calcular a soma dos valores inteiros contidos em um
     *    vetor qualquer.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Randomiza números para o vetor
        Random random = new Random();
        int valores[] = new int[5];
        int total = 0;
        
        
        for(int i = 0; i < valores.length; i++){
            valores[i] = random.nextInt(10); //Randomiza números enter 0 a 9
            System.out.println("Vetor na posição: " + i + " recebeu o valor: " + valores[i]);
            total = total + valores[i];
        }
        
        System.out.println("Total da soma dos valores do vetor = " + total);
        
    }
}
