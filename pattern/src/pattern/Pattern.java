/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author Anurag Jain
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=4;i++)
        {
            System.out.print("");
            System.out.println("*");
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
