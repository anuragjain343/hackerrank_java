/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

/**
 *
 * @author Anurag Jain
 */
class mainthred extends Thread
{
    
    public void run()
    {
       
            System.out.println("this is child ");
        
    }
    
}
public class Multithread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainthred m1=new mainthred();
        
        m1.start();
       
        for(int i=0;i<5;i++)
        {
           Thread.currentThread().setName("anurag");
           System.out.println("main thred executes by:="+Thread.currentThread().getName());
        }
        
    }
}
