/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringupper;
import java.util.*;

import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Stringupper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str,str1,str2,str3;
        System.out.println("enter any string...");
        Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
         char arr[]=new char[str.length()];
        // for(int i=0;i<str.length();i++)
         //{
            // arr[i]=str.charAt(i);
          str1= str.substring(0,1).toUpperCase()+str.substring(1,str.length());
         
         //str= str.toUpperCase();
        // }
         //System.out.println(str1);
         //System.out.println(str2);
         
          System.out.println(str1);
         
}
}