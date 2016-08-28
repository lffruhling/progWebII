/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localizavetor;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class LocalizaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Faça um programa em Java para localizar um determinado valor em um vetor de elementos
        inteiros.
        
        */
        int vetor[] = new int[100];
        
        int localiza = 5;
        boolean localizou = false;
        
        System.out.println("Iniciando sistema...");
        System.out.println("Randomizando valores");
        System.out.println("Preenchendo vetor...");
        
        Random gerador = new Random();
        for (int i = 0; i < 100; i++){
            vetor[i] = gerador.nextInt(100);
        }
        
        System.out.println("Localizando valor de número 5 no vetor...");
        for (int i = 0; i < vetor.length; i++){
            if(localiza == vetor[i]){
                System.out.println("O valor 5 foi localizado na posição: " + i + " do vetor.");
                localizou = true;
            }
        }
        
        if (!localizou){
            System.out.println("O valor 5 foi não foi localizado.");
        }
        
        
        System.out.println("Sistema encerrado...");
        
    }
}
