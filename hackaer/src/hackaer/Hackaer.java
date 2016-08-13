/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaer;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Hackaer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int n;
       int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+"not prime no");
                flag=1;
                break;
            }
        }
            if(flag==0)
            {
	System.out.println(n+" is a Prime Number");
 
         for(int i=1;i<=n;i++)
        { 
            int a=1,b=0,c;
           c=( a+b);
           b=a;
           a=c;
           System.out.println(c);
           if(c==n)
           {
               System.out.println("0");
          }
           else
           {
               System.out.println("0"); 
           }
       
        
    }
        
        }   
    
}
}