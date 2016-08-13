/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfinenumber;
import java.util.*;

import java.util.Scanner.*;

/**
 *
 * @author Anurag Jain
 */
public class Stringfinenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        
        System.out.println("enter any string");
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
        String ss="";
        String ss3="";
        char arr[]=new char[str.length()];
        char arr1[]=new char[str.length()];
        char arr3[]=new char[str.length()];
        
        for(int i=0; i<str.length();i++)
        {
         arr[i]=str.charAt(i);
   if(arr[i]=='1'|| arr[i]=='2'|| arr[i]=='3'|| arr[i]=='4'|| arr[i]=='5'|| arr[i]=='6'|| arr[i]=='7'|| arr[i]=='8'|| arr[i]=='9'|| arr[i]=='0')
   {
     ss=ss+arr[i];
       
      // System.out.println("");
   }
    else   
    {
    ss3=ss3+arr[i];
    
    }
   
    }
        System.out.print(ss);
        System.out.println(ss3);
    }
        
        
       
        }
    

