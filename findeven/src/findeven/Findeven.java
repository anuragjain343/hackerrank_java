/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findeven;
import java.util.*;
import java.util.Scanner.*;


/**
 *
 * @author Anurag Jain
 */
public class Findeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0; int tot=0;
        int arr[]=new int[10];
         int flag=0;
        Scanner sc=new Scanner(System.in);
        System.err.println("enter the 10 no");
        for(int i=0;i<=9;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=9;i++)
        {
            if(arr[i]%2!=0)
            {
               
                 flag=1;
                 
                 break;
                 
            } System.out.println("-1");
        }
         for(int i=0;i<=9;i++)
            {
                if(arr[i]%2==0)
                {
              
                tot=tot+arr[i];
                 }
            }
            System.out.println("------------------");
         System.out.println(tot);
}
    }
