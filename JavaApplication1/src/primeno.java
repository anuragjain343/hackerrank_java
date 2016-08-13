/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.Scanner.*;

public class primeno {
    
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
            }
            else
            {
                 System.out.println(n);
            }
        }
    }
            
}
