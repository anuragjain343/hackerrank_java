/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrevesechar;
import java.util.*;

import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Stringrevesechar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        String str1="";
        String str2="";
        String str3="";
         String str4="";
        System.out.println("enter any string");
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
        char arr[]=new char[str.length()];
        for(int i=str.length()-1;i>=0;i--)
        {
        str1=str1+str.charAt(i);
        }
        for(int i=0;i<=str1.length()-1;i++)
        {
            if(str1.charAt(i)==' ')
             {       
          for(int j=str2.length()-1;j>=0;j--)
             {   
               str3=str3+str2.charAt(j);    
             } 
            System.out.print(str3);
             str3=" ";
             str2=" ";
             }    
            else
            {
               str2=str2+str1.charAt(i);
            } 
        } 
         for(int i=str2.length()-1;i>=0;i--)
        {   
            str4=str4+str2.charAt(i);    
        }
       System.out.print(str4);
        }
        }
        
       
    
    

