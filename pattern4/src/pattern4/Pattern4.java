/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern4;

/**
 *
 * @author Anurag Jain
 */
public class Pattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           for(int i=1;i<=5;i++)
            {
            for(int j=5;j>i;j--)
            {
               System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
            System.out.print("*");
            }
            System.out.print("\n");
            }
           
            for(int i=5;i>=0;i--)
            { 
                
            for(int j=1;j<=(i*2-1);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
        }
        
}
}
