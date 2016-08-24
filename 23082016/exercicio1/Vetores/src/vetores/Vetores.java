/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author IF
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetorA[] = new int[5];
        int vetorB[] = new int[5];
        Teclado t    = new Teclado();
       
        System.out.println("Iniciando Sistema...");
        System.out.println(" ");
        
        for(int i = 0; i < 5; i++){
            vetorA[i] = t.lerInteiro("Informe um valor inteiro: "); 
            
            if((i % 2) == 0){
                vetorB[i] = vetorA[i] * 5;
            }else{
                vetorB[i] = vetorA[i] + 5;
            }
        }
        
        System.out.println(" ");
        System.out.println("Leitura encerrada...");
        System.out.println("Processando resultado...");
        System.out.println(" ");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Posição do vetor: " + i + " Valor do vetorA: " + vetorA[i] + " Valor do vetorB: " + vetorB[i]);
        }
        
        System.out.println(" ");
        System.out.println("Sistema encerrado! ");
    }
}
