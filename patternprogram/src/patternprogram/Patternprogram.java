/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patternprogram;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Patternprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=4;i++)
        {  
           for(int j=4;j>=i;j--)
            {
               System.out.print(" ");
            }
                 for(int j=1;j<=i;j++)
                 {
                     System.out.print("*");
                 }
                 System.out.print("\n");
             
            
            
           
        }
    }
}
