/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarvetor;

/**
 *
 * @author IF
 */
public class OrdenarVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vetor = { 9, 5, 7, 2 };
        int aux = 0;

        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        for (int k = 0; k < vetor.length; k++){
          System.out.println(vetor[k]);                
        }
    }
}
