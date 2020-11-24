
package bufferedreaderdemo;

import java.io.*;

public class BufferedReaderDemo 
{
    public static void main(String[] args) throws Exception
    {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.println("Enter first number");
            String s1  = br.readLine();
            System.out.println("Enter second number");
            String s2 = br.readLine();
            int i1 = Integer.parseInt(s1);
            int i2 = Integer.parseInt(s2);
            int i3 = i1 + i2;
            System.out.println("Sum = "+i3);
        }
    }   
}
