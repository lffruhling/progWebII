/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediacarros;

/**
 *
 * @author Leonardo Fruhling
 * 
 * Escreva um programa em Java que contenha dois vetores com 5 posições.
 * No primeiro vetor devem ser armazenados 5 modelos de carros. O segundo
 * vetor deve armazenar o consumo (Km/l) de cada carro. O programa deve
 * calcular e mostrar:
 * 
 * O modelo do carro mais econômico:
 * quantos litros de combustível cada um dos carro cadastrados consome para
 * percorrer uma distância de 700 km.
 */
public class MediaCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float mediaVeiculo[]    = new float[5];
        String veiculo[]        = new String[5];
        Teclado t               = new Teclado();
        float maiorMedia        = 0;
        int posicao             = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.println(" ");
            veiculo[i]      = t.lerString("Informe o nome do veículo: ");
            mediaVeiculo[i] = t.lerReal("Informe o consumo (km/l) do veículo: ");
            System.out.println(" ");
            
            if(mediaVeiculo[i] > maiorMedia){
                maiorMedia = mediaVeiculo[i];
                posicao = i;
            }
        }
        
        System.out.println(" ");
        System.out.println("O veíclo mais econômico é: " + veiculo[posicao] + " com a media de: " + mediaVeiculo[posicao]);
        System.out.println(" ");
        System.out.println("Quantidade de litros consumido para percorrer 700km");
        System.out.println(" ");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Veículo: " + veiculo[i] + " = " + (700/mediaVeiculo[i]));
        }
    }
}
