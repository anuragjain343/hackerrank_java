/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;
import java.util.*;
import java.util.Scanner.*;
/**
 *
 * @author Anurag Jain
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int y,m,r=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("ente the year no");
         y=sc.nextInt(); 
         System.out.println("ente the month ");
         m=sc.nextInt();
         if(y%4==0)
         {
          System.out.println("welcome to leep year");
           switch(m)
           {
                  case 1:
                  System.out.println("31 day jan");
                  break;
                  case 2:
                  System.out.println("29 day fab march"); break;
                  case 3:
                  System.out.println("31 day april");break;
                  case 4:
                  System.out.println("30 day may");break;
                  case 5:
                  System.out.println("31 day june");break;
                  case 6:
                  System.out.println("30 day july");break;
                  case 7:
                  System.out.println("31 day august");break;
                  case 8:
                  System.out.println("31 day september");break;
                  case 9:
                  System.out.println("30 day october");break;
                  case 10:
                  System.out.println("31 day nomober");break;
                  case 11:
                  System.out.println("30 day december");break;
                  case 12:
                  System.out.println("31 day");break;
                  default:
                  System.out.println("wrong choice");break;                     

                      
            }                                        
                   
                   
         }
         else
         {
              switch(m)
           {
                  case 1:
                  System.out.println("31 day january");
                  break;
                  case 2:
                  System.out.println("28 day fab"); break;
                  case 3:
                  System.out.println("31 day march");break;
                  case 4:
                  System.out.println("30 day april");break;
                  case 5:
                  System.out.println("31 day may");break;
                  case 6:
                  System.out.println("30 day june");break;
                  case 7:
                  System.out.println("31 day july ");break;
                  case 8:
                  System.out.println("31 day august");break;
                  case 9:
                  System.out.println("30 day september");break;
                  case 10:
                  System.out.println("31 day october");break;
                  case 11:
                  System.out.println("30 day nomber");break;
                  case 12:
                  System.out.println("31 day decmber");break;
                  default:
                  System.out.println("wrong choice");break;                     

                      
            }           
         }         
                   
           }
             
         }
    

