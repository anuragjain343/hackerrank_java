/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cognizent;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Cognizent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,n3,tot=0;
        System.out.println("enter thtee number");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1==13)
        {
            System.out.println(n3);
        }
        if(n2==13)
        {
            System.out.println(n1);
        }
         if(n3==13)  
         {
             tot= n1+n2;
             System.out.println(tot);
         }
    }
}
