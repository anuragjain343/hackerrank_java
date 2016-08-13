/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern6;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Pattern6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        for(int i=1;i<=4;i++)
        {  //System.out.print("*");
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                if(k%2==0)
                {
                System.out.print("A");
                }
                else
                {
                    System.out.print("*");  
                }
            }
                 System.out.print("\n"); 
            
           
        }
    }
}
