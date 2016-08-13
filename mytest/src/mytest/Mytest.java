/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mytest;

/**
 *
 * @author Anurag Jain
 */
public class Mytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=122;
        int r=0;
        int k=0;
        while(n!=0)
        {
            r=r*10;
            r=r+n%10;
            n=n/10;
        }
         
            if(k == n)
            {
                System.out.println("the number is palindrome");
            }
            else
            {
                System.out.println("not palindrome");
            }
        }
        
        
        
        
    
}
