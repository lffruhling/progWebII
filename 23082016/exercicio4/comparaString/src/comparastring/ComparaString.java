/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comparastring;

/**
 *
 * @author IF
 */
public class ComparaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "ABC";
        String s2 = "ABB";
        
        if (s1.equals(s2)){
            System.out.println("As palavras são iguas");
        }else{
            System.out.println("As palavras são diferente");
        }
        
        if (s1.compareTo(s2) > 0){
            System.out.println("A palavra " + s1 + " vem antes de " + s2);
        }
    }
}
