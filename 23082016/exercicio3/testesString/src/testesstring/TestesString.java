/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testesstring;

/**
 *
 * @author IF
 */
public class TestesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg = "We wont rock you";
        System.out.println(msg);
        System.out.println( msg.substring(0, 3) + "will" + msg.substring(7, msg.length()) );
    }
}
