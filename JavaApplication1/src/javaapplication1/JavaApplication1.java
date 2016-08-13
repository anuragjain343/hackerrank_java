/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Anurag Jain
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n=423, r ;
        r = 0;
        /*for (int i=0; i<=5; i++)
        {
            f=f1+f2;
            f1=f2;
            f2=f;
            System.out.println(+f);
        }*/
        //for (int i=2; i<=0; i--)
        while(n!=0)
        {
            r=r*10;
            System.out.println(r);
            r=r+n%10;
            
            n=n/10;
            
        }
      //  System.out.println(r);
    }
}
