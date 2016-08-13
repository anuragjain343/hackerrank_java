/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrev;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Stringrev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        
        for(int j=str.length()-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
}
