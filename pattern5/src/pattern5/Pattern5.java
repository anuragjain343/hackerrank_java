/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern5;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Pattern5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               for(int i=1;i<=8;i++)
               {
               for(int k=8;k>=i;k--)
               {
               System.out.print("*");
               }
               for(int j=1;j<=(i*2)-1;j++)
               {     
               System.out.print("-");
               }
               //for(int k=8;k>=i;k--)
              // {
               //System.out.print("*");
               //}
               System.out.println("");
               }        
}
}
