/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sritngreverse;
import java.util.*;

import java.util.Scanner.*;


/**
 *
 * @author Anurag Jain
 */
public class Sritngreverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        String str1=" ";
        String str2=" ";
        System.out.println("enter any string");
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
        
         String st[]=str.split(" ",str.length());
        int l= st.length;
         for(int i=l-1;i>=0;i--)
         {
         System.out.print(st[i]+" ");
         }
    }
}
    

