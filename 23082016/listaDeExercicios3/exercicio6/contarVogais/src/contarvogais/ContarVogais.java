/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarvogais;

/**
 *
 * @author Leonardo
 */
public class ContarVogais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Faça um programa para determinar a quantidade de vogais e de consoantes em um vetor com elementos do tipo char.
        */
        char vetor[] = {'a','b','c','d','e','f','g','h','i'};
        int vogal = 0, consoante = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == ('a') || vetor[i] == ('e') || vetor[i] == ('i') || vetor[i] == ('o') || vetor[i] == ('u')){
                vogal++;
            }else{
                consoante++;
            }
        
        }
        
        System.out.println("Total de vogais: " + vogal + " Total de consoantes: " + consoante);
    }
    
}
