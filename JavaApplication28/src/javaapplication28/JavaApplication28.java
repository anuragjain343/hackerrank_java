/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      // TODO code application logic here
        System.out.println("enter any string");
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int l=str.length();
      // char atr[]=str.toCharArray();
        for (int i =str.length(); i >0;  i--) 
        {
        
            System.out.println( str.charAt(i));
                 
        }
                
     }
}

