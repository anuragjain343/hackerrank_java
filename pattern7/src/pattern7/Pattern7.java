/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern7;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Pattern7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
               System.out.print(k);  
            }
           
            
            System.out.print("\n");
                    
        }
    }
}
