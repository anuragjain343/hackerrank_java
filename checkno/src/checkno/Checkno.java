/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkno;
import java.util.*;
import java.util.Scanner.*;


/**
 *
 * @author Anurag Jain
 */
public class Checkno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int r=0;
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            r=r*10;
            r=r+n%10;
            n=n/10;
        }
        System.out.println(r);
        
    }
}
