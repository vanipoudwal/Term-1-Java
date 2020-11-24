
package threads;

import java.lang.*;

public class Threads 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Thread t = Thread.currentThread();
        System.out.println("Thread is : ");
        t.setName("My Thread");
        System.out.println("Name : "+t);
        t.sleep(10000);
        System.out.println("Hellooo");
    }
}
