/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertevetor;

/**
 *
 * @author Leonardo
 */
public class InverteVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Escreva um programa em Java para inverter os elementos de um vetor de valores do tipo String.
        a. Criando uma cópia do vetor original.
        b. Mudando os elementos do vetor original.
        */
        String vetor[] = {"rua", "casa", "cidade", "estado", "cep"};
        String vetorAux[] = new String[vetor.length];
        int j = 0;
        
        for(int i = 0 ; i < vetor.length; i++){
            vetorAux[i] = vetor[i]; 
        }
        
        for(int i = vetor.length; i > 0; i--){
            vetor[j] = vetorAux[i - 1];
            j++;
        }
        
        System.out.println("Vetor na ordem original:");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetorAux[i]);
        }
        
        System.out.println("Vetor na ordem inversa:");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    
}
