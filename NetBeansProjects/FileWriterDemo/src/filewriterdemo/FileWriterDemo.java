
package filewriterdemo;

import java.io.*;

public class FileWriterDemo 
{
    public static void main(String[] args) 
    {
        try(FileWriter f = new FileWriter("D:\\Files\\File.txt"))
        {
            String source = "This is a FileWriter Program";
            char buffer[] = new char[source.length()];
            source.getChars(0,source.length(),buffer,0);
            f.write(buffer);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
