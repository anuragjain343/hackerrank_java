/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern3;
import java.util.*;
import java.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=8;i>=0;i--)
        {
            for(int j=1;j<=(i*2-1);j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            for(int k=8;k>=i;k--)
            {
                System.out.print(" ");
            }
        }
        
    }
}
