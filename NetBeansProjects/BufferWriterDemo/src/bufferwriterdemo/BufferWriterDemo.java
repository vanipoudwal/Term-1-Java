
package bufferwriterdemo;

import java.io.*;

public class BufferWriterDemo 
{
    public static void main(String[] args) 
    {
        try(BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out)))
        {
            String fruit[] = {"Apple","Banana","Grapes"};
            b.write("Different types of fruit are : "+"\n");
            for(int i = 0; i<3; i++)
            {
                b.write(fruit[i] + "\n");
                b.flush();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
