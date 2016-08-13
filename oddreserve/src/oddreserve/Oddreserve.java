/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oddreserve;
import java.util.*;
import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Oddreserve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("enter the no of reserve no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
            
        }
    }
}
