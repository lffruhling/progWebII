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
        
        // vetor = vetor que queremos ordenar
        int [] vetor = { 9, 5, 7, 2 };

        // aux = variável que usaremos para guardar o maior valor de cada comparação
        int aux = 0;

        // primeiro for = esse for fará com que o a variável i percorra o vetor a ser ordenado, mas ela vai anda                 uma casa enquanto a variável j percorre o vetor todo, ou seja i percorrerá apenas o tamanho do vetor ja             j percorrerá o tamanho do vetor vezes o tamanho do vetor
        for (int i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length; j++){
                if (vetor[i] < vetor[j]){
                    //aqui acontece a troca, do maior cara  vaia para a direita e o menor para a esquerda
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        
        //esse for é simplesmente para testar a ordenação
        for (int k = 0; k < vetor.length; k++){
          System.out.println(vetor[k]);                
        }
    }
}
