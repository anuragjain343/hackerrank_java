/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multipicationofno;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Multipicationofno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
            if(n%3==0 && n%5==0)
            {
                System.out.println("AB");
            }
            else if(n%5==0)
            {
                System.out.println("B");
            }
            else
            {
                System.out.println("A");
            }
        
    }
}
