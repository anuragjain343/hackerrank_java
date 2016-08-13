/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdegit;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Sumofdegit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=0;
        int sum=0,n,tot=0,rem1=0,dsum=0;
        System.out.println("ente the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         restart:
        while(n!=0)
        { 
            r=n%10;
           n=n/10;
            sum=sum+r;  
        }
         System.out.println(sum);
          if(sum<9)
           {
        //  System.out.println(sum);
           }
          else
           {

          while(sum!=0)
          {
         rem1=sum%10;
         dsum+=rem1;
          sum/=10;
          }
     System.out.println(dsum);
       }
          
        }   
           
            
         

        
    }
    

