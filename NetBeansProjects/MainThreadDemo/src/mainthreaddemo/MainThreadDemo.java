
package mainthreaddemo;

import java.lang.*;

public class MainThreadDemo 
{
    public static void main(String[] args) 
    {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is : ");
        t.setName("Main Thread");
        System.out.println("The current thread after name change : "+t);
        System.out.println("The current thread is going to sleep for 10 seconds");
        try
        {
            t.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("After 10 seconds ---------- the Current Thread is existing now..!!");
    }
}
