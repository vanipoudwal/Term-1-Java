
package filereaderdemo;

import java.io.*;

public class FileReaderDemo 
{
    public static void main(String[] args) 
    {
        try(FileReader f = new FileReader("D:\\Files\\File.txt"))
        {
            char[] a = new char[50];
            f.read(a);
            for(char c : a)
            {
                System.out.println(c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
