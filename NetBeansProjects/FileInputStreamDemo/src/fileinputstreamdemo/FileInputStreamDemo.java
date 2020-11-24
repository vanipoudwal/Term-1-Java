
package fileinputstreamdemo;

import java.io.*;

public class FileInputStreamDemo 
{
    public static void main(String[] args) 
    {
        int i;
        char c;
        try(FileInputStream f = new FileInputStream("D:\\Files\\File.txt"))
        {
            while((i = f.read()) != -1)
            {
                c = (char) i;
                System.out.println(c);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}