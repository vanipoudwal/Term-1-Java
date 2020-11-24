
package countdowntimerdemo;

import java.lang.*;

public class CountDownTimerDemo
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread t = Thread.currentThread();
        System.out.println("Thread is : ");
        t.setName("My Thread");
        System.out.println("Name : "+t);
        for(int i=60;i>=0;i--)
        {
            t.sleep(1000);
            System.out.println(i+"seconds to go");
        }
        System.out.println("            ");
        System.out.println("Times up..!!");

        
    }
}
