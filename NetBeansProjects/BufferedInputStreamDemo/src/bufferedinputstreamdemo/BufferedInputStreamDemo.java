
package bufferedinputstreamdemo;

import java.io.*;

public class BufferedInputStreamDemo
{
    public static void main(String[] args) 
    {
        String s = "This is a BufferedInputStream Demo Program";
        byte buf[] = s.getBytes();
        
        try(ByteArrayInputStream in = new ByteArrayInputStream(buf);
            BufferedInputStream f = new BufferedInputStream(in))
        {
            int c;
            while((c = f.read()) != -1)
            {
                System.out.print((char)c);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
