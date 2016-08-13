/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aramstrong;

import java.util.Scanner;

/**
 *
 * @author Anurag Jain
 */
public class Aramstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
        int a=1;
        int b=0;
      int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no for series");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
           c=(a+b);
           b=a;
           a=c;
           System.out.println(c);
        }
       
        
    }
}
