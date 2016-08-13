/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromno;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Palindromno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int r=0;
        System.out.println("enter the for check the no is palimadram or not");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n;
        while(n>0)
        {
            r=r*10;
            r=r+n%10;
            n=n/10;
        }
        if(r==s)
        {
            System.out.println("the given no is palindrome");
        }
        else
        {
            System.out.println("the given no is not palindrame");
        }
    }
}
