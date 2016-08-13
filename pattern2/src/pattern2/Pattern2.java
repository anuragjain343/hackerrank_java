/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=8;i++)
        { 
            for(int j=8;j>=i;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=(2*i-1); k++)
            {      
                System.out.print("*");
                
            }
           System.out.print(" \n");
        }
    }
}
