/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrarofsum;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Arrarofsum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,r=0;
        int[] arr =new int[10];
        System.out.println("ente the 10 no");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=9;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.println("ente the no");
        n=sc.nextInt();
        for(int i=0;i<=9;i++)
        {
            if(arr[i]>n)
            {
                 sum=sum+arr[i];
            }
        }
                
        System.out.println(sum);
        while(sum>0)
        {
           r=r*10;
           r=r+sum%10;
           sum=sum/10;
        }
        System.out.println("--------------------");
        System.out.println(r);
    }
}
