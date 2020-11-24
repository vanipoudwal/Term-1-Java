
package fileoutputstreamdemo;

import java.io.*;

public class FileOutputStreamDemo 
{
    public static void main(String[] args) 
    {
        boolean bool;
        long pos;
        String s = "This is a FileOutputStream Program";
        byte buf[] = s.getBytes();
        try(FileOutputStream fos = new FileOutputStream("D:\\Files\\File.txt"))
        {
            for(int i=0; i<buf.length; i++)
            {
                fos.write(buf[i]);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
