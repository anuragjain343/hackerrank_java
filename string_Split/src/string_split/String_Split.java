/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string_split;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class String_Split {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        str=sc.nextLine();
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
        arr[i]=str.charAt(i);
        if(arr[i]==' ')
        {
        System.out.print("\n");     
        }
        System.out.print(arr[i]);
        }
    }
}
